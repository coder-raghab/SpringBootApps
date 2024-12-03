package in.raghab.generators;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) {
		// Approach - 1
		// return "OD-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
		
		// Approach - 2
		String prefix = "OD-";
		try {
			final int[] maxId = { 0 };

			// Use Hibernate's doWork to safely access JDBC Connection
			session.doWork(connection -> {
				String sql = "SELECT MAX(CAST(SUBSTRING(order_id, 4) AS UNSIGNED)) AS max_id FROM Product";
				try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
						ResultSet resultSet = preparedStatement.executeQuery()) {
					if (resultSet.next()) {
						maxId[0] = resultSet.getInt("max_id");
					}
				}
			});

			// Increment max ID and return the new ID
			return prefix + (maxId[0] + 1);

		} catch (Exception e) {
			throw new RuntimeException("Failed to generate order ID", e);
		}

	}

}

package in.raghab.entity;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	@GeneratedValue(generator = "order-id-generator")
	@GenericGenerator(
	name = "order-id-generator",
	strategy= "in.raghab.generators.OrderIdGenerator"	
	)
	private String OrderId;
	private String OrderedBy;
	private Date OrderPlacedDate;
}

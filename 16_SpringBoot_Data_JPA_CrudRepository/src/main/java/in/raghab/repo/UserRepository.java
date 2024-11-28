package in.raghab.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.raghab.entity.User;
import jakarta.transaction.Transactional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	@Query("from User")
	public List<User> getAllUsersHQL();

	@Query(value = "select * from user_info", nativeQuery = true)
	public List<User> getAllUsersSQL();

	// select * from user_info where country=?
	public List<User> findByCountry(String country);

	// select * from user_info where country=? and gender=?
	public List<User> findByCountryAndGender(String country, String gender);

	// Assignment:: Perform INSERT, Update and DELETE operations using Custom HQL
	// queries.

	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("UPDATE User u SET u.country = :country WHERE u.name = :name")
	public int updateCountryByName(@Param("name") String name, @Param("country") String country);

	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("DELETE FROM User u  WHERE u.name = :name")
	public int deleteByName(@Param("name") String name);

	// Note: HIBERNATE directly not support for insertion so either we need to use
	// Native SQL or Repository save() method.

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO user_info (user_id,user_country,created_at,user_gender,last_updated,user_name) VALUES (:id, :country, :createdAt, :gender, :lastUpdated, :name)", nativeQuery = true)
	int insertUser(@Param("id") Integer id, @Param("country") String country, @Param("createdAt") LocalDate createdAt, @Param("gender") String gender, @Param("lastUpdated") LocalDate lastUpdated, @Param("name") String name);
}

package in.raghab.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="USER_INFO") //optional
public class User {
	@Id
	@Column(name="user_id")//optional
	private Integer id;
	
	@Column(name="user_name")//optional
	private String name;
	
	@Column(name="user_gender")//optional
	private String gender;
	
	@Column(name="user_country")//optional
	private String country;
	
	@CreationTimestamp //populate record created date
	@Column(updatable = false)
	private LocalDate createdAt;
	
	@UpdateTimestamp //populate record updated date
	@Column(insertable = false)
	private LocalDate lastUpdated;
}

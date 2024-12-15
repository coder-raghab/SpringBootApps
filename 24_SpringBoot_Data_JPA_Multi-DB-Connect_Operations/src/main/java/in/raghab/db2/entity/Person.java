package in.raghab.db2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer personId;
	private String personName;
}

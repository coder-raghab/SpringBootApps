package in.raghab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	private Double empSalary;
}

package in.raghab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class SenderAccount {
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Id
	private Integer accountNo;
	private String accountHolder;
	private Long phoneNo;
	private Double amount;
}

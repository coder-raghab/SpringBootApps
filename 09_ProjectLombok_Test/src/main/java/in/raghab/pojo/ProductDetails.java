package in.raghab.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
@Data //It is used for all lombok annotaions at a time
public class ProductDetails {
	private Integer productId;
	private String productName;
	private Double productPrice;
}

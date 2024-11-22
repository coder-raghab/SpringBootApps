package in.raghab.dao;

//ProductDao class treated as Spring bean because i configured into Utils.java using @Bean
public class ProductDao {

	public ProductDao() {
		System.out.println("ProductDao::Constructor");
	}
	public void saveProduct() {
		//logic like Data JPA
		System.out.println("Product details saved..");
	}
	
}

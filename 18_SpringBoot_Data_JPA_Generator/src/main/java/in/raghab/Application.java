package in.raghab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.raghab.service.ContactService;
import in.raghab.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ContactService contactService = context.getBean(ContactService.class);
		
		ProductService productService = context.getBean(ProductService.class);
		
		//contactService.saveContact();
		productService.saveProduct();
	}

}

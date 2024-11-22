package in.raghab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import in.raghab.service.ProductService;

@SpringBootApplication
@ComponentScan(basePackages= {"in.raghab","com.security"})
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		context.getBean(ProductService.class).save();
	}
}

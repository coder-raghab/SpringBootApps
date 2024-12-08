package in.raghab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.raghab.service.PersonPassportService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		PersonPassportService bean = run.getBean(PersonPassportService.class);
		
		//bean.saveData();
//		bean.getPassport();
//		bean.deletePassport();
		
		
//		bean.deletePerson(); //Not allowed
		
	}

}

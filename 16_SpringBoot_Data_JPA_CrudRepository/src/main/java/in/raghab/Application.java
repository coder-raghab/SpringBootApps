package in.raghab;


import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.raghab.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		UserService userService = ctxt.getBean(UserService.class);

		//userService.deleteAllUsers();

		//userService.saveUser();

		//userService.saveUsers();

		//userService.getAllUsers();
		
		//userService.getUserById(201);
		
		//userService.getUsersByCountry("USA");
		
		//userService.getUsersByCountryAndGender("UK", "Male");
		
		//userService.getAllUsersHQL();
		
		//userService.getAllUsersSQL();
		
		//userService.updateCountryByName("Sita", "India");
		//userService.deleteByName("John");
		userService.insertUser(201, "China",LocalDate.now(), "Male", null, "Palash");
	}

}

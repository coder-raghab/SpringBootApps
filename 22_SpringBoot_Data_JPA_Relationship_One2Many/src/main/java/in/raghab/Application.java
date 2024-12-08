package in.raghab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.raghab.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		EmployeeService bean = run.getBean(EmployeeService.class);
		
//		bean.saveEmpWithAddr();
//		bean.getAddr();
//		bean.getEmp();
//		bean.deleteEmp();
		
	}

}

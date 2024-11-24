package in.raghab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.raghab.entity.Employee;
import in.raghab.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeRepository empRepo = context.getBean(EmployeeRepository.class);
		System.out.println("EmployeeRepository Impl Class Name:: "+empRepo.getClass().getName());
		
		Employee emp=new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Mr. Ram");
		emp.setEmpSalary(40000.99);
		
		empRepo.save(emp);
	}
}

package in.raghab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.raghab.entity.Employee;
import in.raghab.repository.EmployeeRepository;

@Service
public class EmpService {
	@Autowired
	private EmployeeRepository empRepo;
	
	public void saveEmp() {
		Employee emp=new Employee();
		emp.setEmpId(1);
		emp.setEmpName("Ram");
		emp.setEmpSalary(2000.55);
		
		empRepo.save(emp);
	}
}

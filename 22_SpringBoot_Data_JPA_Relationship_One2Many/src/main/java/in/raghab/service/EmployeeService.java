package in.raghab.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.raghab.entity.Address;
import in.raghab.entity.Employee;
import in.raghab.repo.AddressRepo;
import in.raghab.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;

	@Autowired
	private AddressRepo addrRepo;
	
	
	public void deleteEmp() {
		empRepo.deleteById(2);
	}
	
	public void getAddr() {
		addrRepo.findById(5);
	}

	public void getEmp() {
		Optional<Employee> byId = empRepo.findById(1);
		if(byId.isPresent()) {
			Employee employee = byId.get();
			//System.out.println(employee);
		}
	}

	public void saveEmpWithAddr() {

		Employee e = new Employee();
		e.setName("John");
		e.setSalary(1000.00);

		Address a1 = new Address();
		a1.setCity("Hyd");
		a1.setState("TG");
		a1.setType("Present");

		Address a2 = new Address();
		a2.setCity("Banglore");
		a2.setState("KA");
		a2.setType("Permanent");

		// set addresses to emp
		List<Address> addrList = Arrays.asList(a1, a2);
		e.setAddr(addrList);

		// set emp to addr
		a1.setEmp(e);
		a2.setEmp(e);

		empRepo.save(e);

	}

}

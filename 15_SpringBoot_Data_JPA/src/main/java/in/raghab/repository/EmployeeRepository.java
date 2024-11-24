package in.raghab.repository;

import org.springframework.data.repository.CrudRepository;

import in.raghab.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}

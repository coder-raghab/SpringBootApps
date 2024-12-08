package in.raghab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.raghab.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}

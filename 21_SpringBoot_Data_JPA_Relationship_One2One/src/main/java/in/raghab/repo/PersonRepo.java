package in.raghab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.raghab.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}

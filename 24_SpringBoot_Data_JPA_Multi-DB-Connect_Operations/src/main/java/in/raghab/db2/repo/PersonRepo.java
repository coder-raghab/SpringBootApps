package in.raghab.db2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.raghab.db2.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}

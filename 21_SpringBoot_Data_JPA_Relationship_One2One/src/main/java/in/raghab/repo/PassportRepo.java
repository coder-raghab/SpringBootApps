package in.raghab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.raghab.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer> {

}

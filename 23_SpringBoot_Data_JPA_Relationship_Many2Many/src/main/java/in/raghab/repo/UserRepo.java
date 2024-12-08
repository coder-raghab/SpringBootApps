package in.raghab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.raghab.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}

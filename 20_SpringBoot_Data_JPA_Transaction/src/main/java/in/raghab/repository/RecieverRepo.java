package in.raghab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.raghab.entity.RecieverAccount;

public interface RecieverRepo extends JpaRepository<RecieverAccount, Integer> {

}

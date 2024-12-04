package in.raghab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.raghab.entity.SenderAccount;

public interface SenderRepo extends JpaRepository<SenderAccount, Integer> {

}

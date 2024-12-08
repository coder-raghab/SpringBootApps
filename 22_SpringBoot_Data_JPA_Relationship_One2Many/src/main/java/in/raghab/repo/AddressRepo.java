package in.raghab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.raghab.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}

package in.raghab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.raghab.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

}

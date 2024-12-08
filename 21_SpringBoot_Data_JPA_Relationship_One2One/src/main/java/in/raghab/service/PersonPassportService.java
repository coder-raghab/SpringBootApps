package in.raghab.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.raghab.entity.Passport;
import in.raghab.entity.Person;
import in.raghab.repo.PassportRepo;
import in.raghab.repo.PersonRepo;

@Service
public class PersonPassportService {
	@Autowired
	private PersonRepo personRepo;

	@Autowired
	private PassportRepo passportRepo;

	public void saveData() {

		Person person = new Person();
		person.setName("Ram");
		person.setGender("Male");
		Person savedPerson = personRepo.save(person);

		Passport passport = new Passport();
		passport.setPassportNum("XXX69996E");
		passport.setIssuedAt(LocalDate.now());
		passport.setExpireAt(LocalDate.now().plusYears(10));

		passport.setPerson(savedPerson);

		passportRepo.save(passport);

	}

	public void deletePerson() {
		personRepo.deleteById(1);
	}

	public void getPerson() {
		Optional<Person> byId = personRepo.findById(1);
		if (byId.isPresent()) {
			System.out.println(byId.get());
		}
	}

	public void deletePassport() {
		passportRepo.deleteById(2);
	}

	// left join
	public void getPassport() {
		Optional<Passport> byId = passportRepo.findById(2);
		if (byId.isPresent()) {
			System.out.println(byId.get());
		}
	}

}

package in.raghab.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.raghab.entity.Person;
import in.raghab.repo.PersonRepo;

@Service
public class PersonService {
	@Autowired
	private PersonRepo personRepo;
	
	public void savePersons() {

		Person p1 = new Person(1, "Raj", 20, "Male", "India");
		Person p2 = new Person(2, "Anil", 32, "Male", "India");
		Person p3 = new Person(3, "Sunil", 23, "Male", "India");
		Person p4 = new Person(4, "John", 24, "Male", "USA");
		Person p5 = new Person(5, "Robert", 55, "Male", "UK");
		Person p6 = new Person(6, "Sita", 46, "Fe-Male", "India");
		Person p7 = new Person(7, "Gita", 27, "Fe-Male", "Japan");
		Person p8 = new Person(8, "Cathy", 38, "Fe-Male", "Canada");

		List<Person> asList = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);

		personRepo.saveAll(asList);
	}
	
	//Sorting
	public void getPersonsSort() {
		Sort sort = Sort.by("age").ascending();
		List<Person> all = personRepo.findAll(sort);
		all.forEach(System.out::println);
	}
	
	//pagination
	public void getPersonsPagination() {
		int pageSize=3; //Fixed Value
		int pageNo=1; //comes from UI and pageNo in pageRequest treated like array index starting from 0
		PageRequest pageRequest = PageRequest.of(pageNo-1, pageSize);
		Page<Person> page = personRepo.findAll(pageRequest);
		List<Person> content = page.getContent();
		content.forEach(System.out::println);
	}
	
	//Query By Example
	public void getPersonsQBE(String country,String gender) {
		Person person=new Person();
		if(country != null) {
			person.setCountry(country);
		}
		if(gender != null) {
			person.setGender(gender);
		}
		Example<Person> example = Example.of(person);
		List<Person> all = personRepo.findAll(example);
		all.forEach(System.out::println);
	}
	
}

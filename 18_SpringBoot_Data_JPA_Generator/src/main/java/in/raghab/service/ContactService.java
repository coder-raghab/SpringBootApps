package in.raghab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.raghab.entity.Contact;
import in.raghab.repo.ContactRepo;

@Service
public class ContactService {
	@Autowired
	private ContactRepo contactRepo;
	
	public void saveContact() {
		Contact contact=new Contact();
		//contact.setId(1);//update purpose i used
		
		contact.setEmail("Onkar@gmail.com");
		contact.setPhone(9700000048L);
		contact.setName("Onkar Banerjee");
		
		System.out.println("Before id Generation: "+contact);
		contactRepo.save(contact);
		System.out.println("After id Generation: "+contact);
	}
}

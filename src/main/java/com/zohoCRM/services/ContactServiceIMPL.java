package com.zohoCRM.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohoCRM.entities.Contact;
import com.zohoCRM.repositories.ContactRepository;

@Service
public class ContactServiceIMPL implements ContactService {
	
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public void saveOnecontact(Contact contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact getContactById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}

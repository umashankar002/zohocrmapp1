package com.zohoCRM.services;

import java.util.List;

import com.zohoCRM.entities.Contact;

public interface ContactService {

	public void saveOnecontact(Contact contact) ;

	public List<Contact> getAllContacts();

	public Contact getContactById(long id);
}

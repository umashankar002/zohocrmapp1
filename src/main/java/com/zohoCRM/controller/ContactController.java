package com.zohoCRM.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohoCRM.entities.Contact;
import com.zohoCRM.services.ContactService;

@Controller
public class ContactController {
	
	private ContactService contactService;
	

	public ContactController(ContactService contactService) {
		super();
		this.contactService = contactService;
	}


	@RequestMapping("/listAllContacts")
	public String listAllContacts(Model model) {
		List<Contact> allContacts = contactService.getAllContacts();
		model.addAttribute("contact",allContacts);
		return "list_contacts";
	}
}

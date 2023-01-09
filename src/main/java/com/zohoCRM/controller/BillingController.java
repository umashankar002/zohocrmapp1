package com.zohoCRM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohoCRM.entities.Billing;
import com.zohoCRM.entities.Contact;
import com.zohoCRM.services.BillingService;
import com.zohoCRM.services.ContactService;

@Controller
public class BillingController {
	@Autowired
	private BillingService billingService;
	private ContactService contactService;
	
	public BillingController(ContactService contactService) {
		super();
		this.contactService = contactService;
	}


	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("id") long id,Model model) {
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact",contact);
		return "generate_bill";
	}
	
	@PostMapping("/saveBill")
	public String saveBill(@ModelAttribute("billing") Billing billing,Model model) {
		billingService.saveOneBill(billing);
		//List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("bill",billing);
		return"bill_info";
	}
}

package com.zohoCRM.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceIMPL implements EmailService {
	
	@Autowired
	private JavaMailSender sendEmail;

	@Override
	public String SendMail(String to, String sub, String email) {
		SimpleMailMessage mail=new SimpleMailMessage();
		mail.setTo(to);
		mail.setSubject(sub);
		mail.setText(email);
		
		sendEmail.send(mail);
		return null;
	}

}

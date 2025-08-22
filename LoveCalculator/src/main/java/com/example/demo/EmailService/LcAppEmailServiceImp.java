package com.example.demo.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class LcAppEmailServiceImp implements LcAppEmailService{

	@Autowired
	private JavaMailSender imp;
	
	@Override
	public void sendMail(String userName,String userEmail, String result) {
		
		SimpleMailMessage newMail = new SimpleMailMessage();
		newMail.setTo(userEmail);
		newMail.setSubject("Love Calculator");
		newMail.setText("Hi " + userName +"! " + " \n The result predicated by the LcApp is "+ result);
		
		imp.send(newMail);
	}


	
}

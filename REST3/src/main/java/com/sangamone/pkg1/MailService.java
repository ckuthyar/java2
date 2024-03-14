package com.sangamone.pkg1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MailService {
	@Autowired
	JavaMailSender jms;
	public void sendMail() {
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setFrom("ckuthyar@gmail.com");
		smm.setTo("shashanks.sangamone@gmail.com");
		smm.setSubject("Test 11-Mar-2024");
		smm.setText("Hello");
		jms.send(smm);
		
	}

}

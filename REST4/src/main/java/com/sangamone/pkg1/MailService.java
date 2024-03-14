package com.sangamone.pkg1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	@Autowired
	JavaMailSender jms;
	
	public String sendMail(String recipient1, String sub1, String msg1) {
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setFrom("ckuthyar@gmail.com");
		smm.setTo(recipient1);
		smm.setSubject(sub1);
		smm.setText(msg1);
		jms.send(smm);
		
		return "Success";
	}
	
	

}

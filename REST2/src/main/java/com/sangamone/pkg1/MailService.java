package com.sangamone.pkg1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService { 
	@Autowired
	JavaMailSender jms;
	
	public ArrayList<String> sendMail() throws IOException{
		String[]arr1;
		SimpleMailMessage smm = new SimpleMailMessage();
		smm.setFrom("ckuthyar@gmail.com");
		File f1=new File("friends1.txt");
		Scanner sc1=new Scanner(f1);
		String s1="";
		ArrayList<String>names1=new ArrayList<>();
		while (sc1.hasNext()){
			s1=sc1.nextLine();
			arr1=s1.split(",");		
			smm.setTo(arr1[0]);
			smm.setSubject("Repeat Test Mail to "+arr1[1]);
			smm.setText("Good Morning " + arr1[1]);
			names1.add(arr1[1]);
			jms.send(smm);
		}
		return names1;
	}
	
}

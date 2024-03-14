package com.sangamone.pkg1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
@RestController
public class MailController {
	@Autowired
	MailService ms;
	
	@PostMapping("/mail")
	public String testMail() throws IOException {
		ArrayList<String>names2=new ArrayList<>();
		names2=ms.sendMail();
		String s1=names2.get(0)+names2.get(1)+names2.get(2)+names2.get(3);
		return "E-Mail Sent to "+s1;
	}

}

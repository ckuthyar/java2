package com.sangamone.pkg1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	@Autowired
	MailService ms;
	
	public String setText(String name1) {
		String s1="Dear"+name1+", Congrats on being appointed as Location Head at Bangalore";
		return s1;
	}
	
	@PostMapping("/mail")
	private String testMail() {
		ms.sendMail("sivashankarchandrappa.sangamone@gmail.com","Congrats",setText("Sivashankar"));
		ms.sendMail("laluprasaddash23.sangamone@gmail.com","Congrats",setText("Lalu"));
		
		return "Success";
	}
	

}

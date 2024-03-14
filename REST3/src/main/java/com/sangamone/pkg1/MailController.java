package com.sangamone.pkg1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	@Autowired
	MailService ms;
	
	@PostMapping("/mail")
	public String testMail() {
		ms.sendMail();
		return "Success";
	}

}

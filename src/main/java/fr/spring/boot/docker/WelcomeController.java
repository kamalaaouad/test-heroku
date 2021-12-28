package fr.spring.boot.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/message")
	public String getMessage() {
		return "hello world with heroku is product salesforce";
	}
}

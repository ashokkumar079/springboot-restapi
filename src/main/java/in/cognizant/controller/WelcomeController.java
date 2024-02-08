package in.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/get")
	public String welcome() {
		return "Hey Ashok!! wassupp";
	}
}

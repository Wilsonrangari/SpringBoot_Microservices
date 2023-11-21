package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	
	@GetMapping("/")
	private String getWelcomeMsg() {
		
		return "Welcome Message";
	}

}

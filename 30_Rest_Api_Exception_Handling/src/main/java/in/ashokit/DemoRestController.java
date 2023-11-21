package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		String msg="Welcome to REST API.....!";
		
		int i=10/0;
	
		return msg;
		
	}

}

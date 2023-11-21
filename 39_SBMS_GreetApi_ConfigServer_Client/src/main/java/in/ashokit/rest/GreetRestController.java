package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	
	
	//to load yml data into java class variable use @Value
	@Value("${msg}")
	private String msg;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		return msg;
	}

}

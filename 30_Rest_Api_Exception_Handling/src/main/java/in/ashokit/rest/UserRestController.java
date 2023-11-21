package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	
	@GetMapping("/user/{userId}")
	public String getUserName(@PathVariable("userId")Integer userId) throws Exception {
		
		if(userId == 100) {
			return "John";
			
		}else if(userId == 200) {
			return "Wilson";
			
		}else {
			throw new Exception("User Not Found");
		}
	}

}

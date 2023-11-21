package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	
	
	@GetMapping("/")
	public Customer getCustomer() {
		
		Customer c= new Customer();
		
		c.setId(1);
		c.setName("Wilson");
		c.setEmail("wilson@gmail.com");
		c.setPhno(764131321);
		System.out.println("JSON data has been retunred to browser which is taken care by SpringBoot");
		
		return c;
	}

}

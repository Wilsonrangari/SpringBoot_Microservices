package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.ashokit.feign.GreetFeignClient;

@RestController
public class WelcomeRestController {
	
	/*@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		
		  RestTemplate rt= new RestTemplate();
		  
		  //output ye string type ka dega isiliye String.class
		   *  ResponseEntity<String>
		  forEntity = rt.getForEntity("http://localhost:8082/greet", String.class);
		  
		  String greetResp = forEntity.getBody();
		  
		  return greetResp + ", Welcome Wilson " ;
		 */
		
		//OR Better Approach because in above apprch if i change the url for greet it will not work
		
		@Autowired
		private GreetFeignClient greetClient;
		
		@GetMapping("/welcome")
		public String getWelcomeMsg() {
			String greetResp = greetClient.invokeGreetApi(); //ye us method pe fligntclient pe value jo hai vo eureka server pe check karega and request karega uska url aur vo jaise hi mil jaega uska data ye le lega
			
			return greetResp + " ,Welcome To Ashok It";
		}
	}



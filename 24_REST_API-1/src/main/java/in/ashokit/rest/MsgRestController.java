package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	//@PostMapping("/") if you try to access thid meyhod from browser you will get error so if you want to testt this method use postman
	@GetMapping("/")
	public String getWelcomeMsg() {

		String msg = "Welcome to REST API";

		return msg;
	}

	@GetMapping("/welcome")
	public String getGreetMsg() {
		return "Good Evening";
	}

	@PostMapping("/save")
	public ResponseEntity<String> saveMsg() {

		String responseBody = "Msg Saved Successfully";

		return new ResponseEntity<String>(responseBody, HttpStatus.CREATED);
		// Integer responseB = 230;
		// return new ResponseEntity<Integer>(responseB, HttpStatus.CREATED);

	}

}

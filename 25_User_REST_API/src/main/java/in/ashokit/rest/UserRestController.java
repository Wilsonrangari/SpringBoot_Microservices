package in.ashokit.rest;

import java.util.HashMap;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.User;

@RestController
public class UserRestController {

	private Map<Integer, User> dataMap = new HashMap<>();

	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		System.out.println(user);
		dataMap.put(user.getId(), user);
		System.out.println(user.getId());

		return new ResponseEntity<String>("User Saved", HttpStatus.CREATED);
	}
	//Query param
//	@GetMapping("/userById")
//	public User getUser(@RequestParam("userid") Integer userId) {
//		User user = dataMap.get(userId);
//		System.out.println("we are getting user by its id " + userId + " " + user);
//		return user;
//
//	}

	//path param 
	@GetMapping("/userByParam/{id}/data")
	public User getUserDetails(@PathVariable("id") Integer userId) {

		User user = dataMap.get(userId);
		System.out.println(user);
		return user;

	}

}

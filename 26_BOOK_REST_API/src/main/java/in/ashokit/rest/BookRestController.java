package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Book;

@RestController
public class BookRestController {

	@GetMapping(value = "/book", produces = { "application/xml", "application/json" })
	public Book getBook() {

		Book b = new Book();
		b.setId(1);
		b.setName("Wilson");
		b.setPrice(100.00);

		return b;
	}

	@PostMapping(value="/save", consumes = {"application/xml", "application/json"})
	public ResponseEntity<String> saveUser(@RequestBody Book b){
		
		System.out.println(b);
		String msg = "Record Saved..!";

		return  new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

}

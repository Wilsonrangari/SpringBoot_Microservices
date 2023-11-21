package in.ashokit.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Book;
import in.ashokit.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repo;
	
	@GetMapping("/book")
	public ModelAndView getBookById(@RequestParam("id") Integer id) {   //because we are getting input bookid from Ui interface so use @RequestParam
		
		System.out.println("ID "+ id);
		ModelAndView mav= new ModelAndView();
		
		Optional<Book> findById = repo.findById(id);
		
		if(findById.isPresent()) {
			Book bookObj = findById.get();
			System.out.println(bookObj);
			
			//sending data to view
			mav.addObject("book",bookObj);
			
		}
		//Setting view page Name
		mav.setViewName("index");
		
		return mav;
		
	}

}

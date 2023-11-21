package in.ashokit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepositotry;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
		BookRepositotry repo = ctxt.getBean(BookRepositotry.class);
		System.out.println(repo.getClass().getName());
		
		/*
		 * Book b1 = new Book();
		 * 
		 * //how to set the data
		 * 
		 * b1.setBookId(104); b1.setBookName("React JS"); b1.setBookPrice(3500.00);
		 * 
		 * Book b2 = new Book(); b2.setBookId(105); b2.setBookName("Vue JS");
		 * b2.setBookPrice(4500.00);
		 * 
		 * // To save single object but what if we want to save multiple object use
		 * saveAll method // repo.save(b);
		 * 
		 * 
		 * ArrayList<Book> bookList = new ArrayList<>(); bookList.add(b1);
		 * bookList.add(b2); repo.saveAll(bookList);
		 * 
		 * //or use Arrays.asList() method same work as above
		 * repo.saveAll(Arrays.asList(b1,b2)); // Here b1 and b2 will be converted into
		 * list obejct
		 * 
		 * System.out.println("Record inserted.......");
		 * 
		 * //how to retrive the data
		 * 
		 * Optional<Book> findById = repo.findById(101);
		 * 
		 * System.out.println(findById.get());
		 */
		
		//List<Book> books = repo.findByBookPriceGreaterThan(100.00);
		//List<Book> books = repo.getAllBooks();
		List<Book> books = repo.getBooks();
		
		for(Book b : books) {
			
			System.out.println(b);
		}
			 
	}

}
		

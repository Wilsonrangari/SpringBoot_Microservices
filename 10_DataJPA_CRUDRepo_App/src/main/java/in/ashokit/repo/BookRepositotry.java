package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Book;

public interface BookRepositotry extends CrudRepository<Book, Integer>{
	
	/*
	 * public List<Book> findByBookPriceGreaterThan(Double price);
	 * 
	 * public List<Book> findByBookPriceLessThan(Double price);
	 * 
	 * //select * from book where book_name=: bookname public List<Book> findByBookName(String bookName);
	 * 
	 */
	
	//Custom Query
	@Query(value="select * from book", nativeQuery=true)
	public List<Book> getAllBooks();
	
	
	  @Query("from Book") 
	  public List<Book> getBooks();
	 
	

}

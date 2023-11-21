package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.entity.Product;
import in.ashokit.repository.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository repo;
	
	@GetMapping("/")
	public String loadForm(Model model) {
		
		model.addAttribute("product", new Product());
		return "index";
	}
	
	@PostMapping("/product")
	public String saveProduct(@ModelAttribute("product") Product p,Model model) {
		
		 p=repo.save(p);
		 
		 if(p.getPid()!=null) {
			 
			 model.addAttribute("msg", "Product Saved");
			 
		 }
		
		return "index";
	}
	
	
	@GetMapping("/products")
	public String getAllProducts(Model model) {
		
		List<Product> list = repo.findAll();
		
		model.addAttribute("products", list);
		
		
		
		return "data";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("pid") Integer pid, Model model) { //i am capturing id as a "pid"
		
		repo.deleteById(pid);
		model.addAttribute("msg", "Product deleted");
		model.addAttribute("product", repo.findAll()); //latest records after deleteing 
		return "data";
	}

}

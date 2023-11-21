package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.Product;
import in.ashokit.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository repo;

	@GetMapping("/")
	public String LoadForm(Model model) {

		model.addAttribute("p", new Product());

		return "index";

	}

	@PostMapping("/save_product")
	public String handleSave(@ModelAttribute("p") Product p, Model model) { // whaterver i captured data from Ui display
																			// same data

		p = repo.save(p);

		if (p.getPid() != null) {
			model.addAttribute("msg", "Data saved");
		}
		// model.addAttribute("p", new Product()); //it will map the java object to
		// index file if you dont use use @Model
		return "index";
	}

	@GetMapping("/products")
	public String getProducts(Model model) {

	//	List<Product> findAll = repo.findAll();

		model.addAttribute("productObjKey", repo.findAll());
		System.out.println(repo.findAll());
		
		return "data";
	}

}

package in.ashokit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.StudentBinding;


import in.ashokit.service.StudentService;


@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/welcome")
	public String loadIndexPage(Model model) {

		StudentBinding studentObj = new StudentBinding();
		System.out.println(studentObj);
		model.addAttribute("student", studentObj); //just telling here that we haved mapped UI with studentOnj

		return "index";
	}

	@PostMapping("/save")
	public String saveFormData(StudentBinding studentObj, Model model) {    //once you click on save button studentObj will store the data of form


		System.out.println(studentObj); //once dislay on console we want to clean the form sp nelow creating new object

		//		StudentEntity entity = new StudentEntity();	
		//		BeanUtils.copyProperties(studentObj, entity);
		//		repo.save(entity);

		boolean isSaved = service.saveStudent(studentObj);

		if(isSaved) {
			model.addAttribute("msg","DATA Saved");
		}





		model.addAttribute("student", new StudentBinding() ); //here creating empty object so people can once type input

		return "index";
	}

}

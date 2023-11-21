package in.ashokit.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Student;
import in.ashokit.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	//it is creating empty student object and setting that object to model object and returning the view
	public String loadIndexPage(Model model) {
		
		//System.out.println(model.getClass());
		
		//Student sobj=new Student();
		
		// why are you sending emmplty student obj? to show form as empty
		//sobj.setName("Wilson");
		//model.addAttribute("student", sobj);
		//if you want to show name on form use this
		
		//OR
		//model.addAttribute("student", new Student());
		//List<String> courseList = service.getCourses();
		
		//to send controller data to ui use model object
		//we are accessing courseList from Ui beacuse of model object
		//model.addAttribute("courses",courseList );
		
		init(model);
		
		return "index";
	}


	private void init(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("courses",service.getCourses() );
		model.addAttribute("prefTimings",service.getTimings() );
	}
	
	
	//capturing student  data into an object once you click save
	@PostMapping("/save")
	public String handleSubmitButton(Student s,Model model) {
		
		System.out.println(s);
		
		boolean isSaved = service.saveStudent(s);
		
		if(isSaved) {
			model.addAttribute("msg", "Data Saved.....");
		}
		
		
		init(model);
		
		return "index";
	}

}

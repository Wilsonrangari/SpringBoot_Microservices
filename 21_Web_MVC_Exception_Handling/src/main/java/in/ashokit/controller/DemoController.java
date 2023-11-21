package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/hi")
	public String getMsg(Model model) {
		
		String msgTxt="Good Evening..!!";
		
		model.addAttribute("msg", msgTxt);
		
		return "index";
	}

}

package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller   //Repressent java class as controller class
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Hi, Welcome to Ashok It--!"); //this is my response in Key Value pair
		
		//how ehere it has to display
		mav.setViewName("message"); //my cpntroller only know file name(internally it will be message.jsp)
		return mav;
	}
		
	
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		ModelAndView mav=new ModelAndView();
		 
		mav.addObject("msg","Good Evening....!!");
		mav.setViewName("message");    //both methods returnig message.jsp page
		
		return mav;
	}
	
	

}
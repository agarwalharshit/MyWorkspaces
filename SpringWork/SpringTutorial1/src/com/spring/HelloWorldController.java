package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
		
		return new ModelAndView("hello", "data", "harshit");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

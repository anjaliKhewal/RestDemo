package com.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {
	
	@RequestMapping(value ="/hello", method =RequestMethod.GET )
	public String hello(ModelMap model){
		
		model.addAttribute("msg","Welcome to My REST WOrld!");
		return "helloWorld";
		
		}
	@RequestMapping(value= "/displayMessage/{msg}", method = RequestMethod.GET)
	public String dispalyMessage(@PathVariable String msg, ModelMap model){
		model.addAttribute("msg",msg);
		return "helloWorld";
		
	}

}

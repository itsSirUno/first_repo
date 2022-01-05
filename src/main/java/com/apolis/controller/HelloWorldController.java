package com.apolis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.apolis.model.HelloWorld;

@Controller
public class HelloWorldController
{
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public ModelAndView handler()
	{
		ModelAndView mv= new ModelAndView();
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMessage("Aloha World");
		mv.addObject("Hello World", helloWorld);
		mv.setViewName("Welcome");
		return mv;
	}
}

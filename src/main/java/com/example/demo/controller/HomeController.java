package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;

@Controller
public class HomeController {
	
	@RequestMapping("/test")
	String my()
	{
		return "page2.html";
	}
	
	
	@RequestMapping("/")
	String myIndex(Model m)
	{
		Student s = new Student();
		System.out.println("/"+s);
		
		m.addAttribute("obj", s);
		return "index.html";
	}


	@RequestMapping("/reg")
	String MyPage1(@ModelAttribute ("obj")Student s,Model m)
	{
		System.out.println("/reg"+s);
		m.addAttribute("obj", s);
		return "page1.html";
		
	}
}

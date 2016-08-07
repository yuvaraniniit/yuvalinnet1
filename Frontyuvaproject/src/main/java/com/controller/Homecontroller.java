package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Login;
import com.service.LoginService;


@Controller
public class Homecontroller {
	@Autowired
	 private LoginService ls;
	
	@RequestMapping("/")
	public String getHome()
	{
		return "index";
	
	}
	@RequestMapping(value="/login")
	public String getlogin()  
	{
		return "Login";
	}
	@RequestMapping(value = "/flogin")
	public ModelAndView loginuser(@RequestParam("name") String name, @RequestParam("pwd") String pwd) {
		boolean isvalidUser = false;
		Login lo = new Login();
		lo.setName(name);
		lo.setPassword(pwd);
		ls.ind(lo);
		isvalidUser = ls.check(lo);
		ModelAndView mv = new ModelAndView("index");
		if (isvalidUser == true) {
			mv.addObject("msg", "hello welcome");
			mv.addObject("name", lo.getName());
      	}
		return mv;
	}

}

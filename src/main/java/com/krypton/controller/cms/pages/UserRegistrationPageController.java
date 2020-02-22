package com.krypton.controller.cms.pages;

import javax.annotation.Resource;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.krypton.beans.user.User;
import com.krypton.mongo.services.MongoDaoService;
@Controller
public class UserRegistrationPageController {
	@Resource
	private MongoDaoService mongoDaoService;
	@Resource
	private PasswordEncoder passwordEncoder;
	@RequestMapping(method=RequestMethod.GET,path = "/register")
	public ModelAndView getRegisterPage(@ModelAttribute("user") User user) {
		ModelAndView model=new ModelAndView();
		
		model.setViewName("register");
		
		return model;
	}

	
	@RequestMapping(method=RequestMethod.POST,path = "/register")
	public ModelAndView getRegisterPagePost(@ModelAttribute("user") User user) {
		ModelAndView model=new ModelAndView();
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		mongoDaoService.save(user);
	
		model.setViewName("hello");
		
		return model;
	}

}

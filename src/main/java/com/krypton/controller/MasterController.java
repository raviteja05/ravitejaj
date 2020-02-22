package com.krypton.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.krypton.beans.cms.Component;
import com.krypton.beans.cms.Page;
import com.krypton.beans.cms.Section;
import com.krypton.beans.cms.components.Navigation;
import com.krypton.beans.cms.data.Data;
import com.krypton.beans.user.User;
import com.krypton.cms.services.impl.PageContentImportService;
import com.krypton.mongo.services.MongoDBService;
import com.krypton.mongo.services.MongoDaoService;

@Controller
public class MasterController {
	@Resource
	private MongoDaoService mongoDaoService;
	@RequestMapping(method=RequestMethod.GET,path = "/page/{pageLabel}")
	public ModelAndView getPage(@PathVariable String pageLabel) {
		ModelAndView model=new ModelAndView();
		
		Page page=new Page();
		
	
		ObjectMapper om=new ObjectMapper();
		try {
			new PageContentImportService().processData("/static/home.json");
			om.readValue(new ClassPathResource("static/home.json").getFile(), Page.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addObject("user", new User());
		model.setViewName(pageLabel);
		return model;
	}
	
	
	
	

}

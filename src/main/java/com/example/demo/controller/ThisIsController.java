package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.ThisIsModel;
import com.example.demo.service.ThisIsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




@Controller
public class ThisIsController {
	
	private final static Logger logger = LoggerFactory.getLogger(ThisIsController.class);
	@Autowired
	ThisIsModel model;

	@Autowired
	ThisIsService service;
	
	@GetMapping("/")
	public String hi() {
		return "index";
	}
	
	@GetMapping("/add")
	public String hello(ThisIsModel model) {
	
		model.getName();
	logger.info("名字"+model.getName());
		model.getPhone();
		service.addName(model);
		return "index";
	}
	
	
	
	
}

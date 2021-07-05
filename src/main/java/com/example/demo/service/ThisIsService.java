package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ThisIsModel;
import com.example.demo.repository.ThisIsRepository;

@Service
public class ThisIsService {

	@Autowired
	ThisIsRepository repository;
	
	
	public void addName(ThisIsModel model) {
		repository.addName(model);
	}
}

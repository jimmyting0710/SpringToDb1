package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ThisIsModel;

@Repository
public class ThisIsRepository {
	@Autowired
	private JdbcTemplate jTemplate;
	
	public void addName(ThisIsModel model) {
		System.out.println("insert");
		jTemplate.update("insert into test(name,phone) "
				+ "values (?,?)",model.getName(),model.getPhone());
		
	}
}

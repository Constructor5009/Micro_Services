package com.nmims.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nmims.core.entity.Employee;
import com.nmims.core.repository.MyEmployeeRepos;


@RestController
public class MyController {

	@Autowired
		MyEmployeeRepos repository;
	
	@RequestMapping(value="/employees")
	public List<Employee>getAllEmployees(){
		
		return repository.findAll();
	}
}

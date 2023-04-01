package com.nagarro.azureAssignment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.azureAssignment.Entity.Employee;
import com.nagarro.azureAssignment.Repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repository;
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return repository.save(employee);
	}
	
	@GetMapping("/get")
	public List<Employee> getEmployees(){
		return repository.findAll();
	}

}

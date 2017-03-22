package com.springbootsample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootsample.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping("/getAllRecords")
	public @ResponseBody List<Employee> getAllEmpRecords(){
		List<Employee> employees = new ArrayList<>();
		
		Employee anEmployee = new Employee();
		anEmployee.setEmpName("Sujan");
		anEmployee.setEmpPhone("9804373727");
		employees.add(anEmployee);
		
		
		Employee anEmployee1 = new Employee();
		anEmployee1.setEmpName("Bisu");
		anEmployee1.setEmpPhone("9038159969");
		employees.add(anEmployee1);
		return employees;
	}

}

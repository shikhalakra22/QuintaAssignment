package com.example.demo;
import java.util.*;
import java.util.stream.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import static org.springframework.data.mongodb.core.query.Query.query;

@Service
public class EmployeeFunction {
	@Autowired
	private EmployeeRepo repo;


	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public List<Employee> getAllEmployeeRegion(String region) {
		
		return repo.findByRegion(region);
	}

	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		return repo.findByName(name);
	}

	public List<Employee> getAllbySalaryGreaterThan(int salary) {
		// TODO Auto-generated method stub
		
		
		return repo.findsalary(salary);
	}

	public List<Employee> findByNameStartingWith(String name) {
		// TODO Auto-generated method stub
		return repo.findByNameStartingWith(name);
	}

	public List<Employee> getEmployeeAgeGreater(int age) {
		// TODO Auto-generated method stub
		return repo.getEmployeeAgeGreater(age);
	}

	public List<Employee> getEmployeeAgeandRegion(String region,int age) {
		// TODO Auto-generated method stub
		return repo.getEmployeeAgeandRegion(region,age);
	}

	public List<Employee> getEmployeeNameStartwith(String name) {
		// TODO Auto-generated method stub
		return repo.getEmployeeNameStartwith(name);
	}

	public List<Employee> getEmployeeMaxSalary() {
		// TODO Auto-generated method stub
		return repo.getEmployeeMaxSalary();
	}

	
	
	

}

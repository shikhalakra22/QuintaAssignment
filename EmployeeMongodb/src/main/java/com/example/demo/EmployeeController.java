package com.example.demo;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo repo;
	
	@Autowired
	private EmployeeFunction employeeFunction;
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		repo.save(employee);
		return "Added Employee Successfully with id: " + employee.getId();
	}

	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployees(){
		return employeeFunction.getAllEmployee();
	}
	@GetMapping("/getAllEmployee/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id){
		return repo.findById(id);
		
	}
	@DeleteMapping("/delete/{id}")
	public String deleteEmployees(@PathVariable int id){
		 repo.deleteById(id);
		 return"employee with"+ id + "deleted Successfully";
	}
//	@RequestMapping(value="/getregion",method=RequestMethod.GET)
//	public List<String> getregion(@RequestParam String region) {
//		return employeeFunction.getRegion(region);
//	}
	
	@GetMapping("/getAllEmployeeRegion")
	public List<Employee> getAllEmployeeRegion(@RequestParam String region){
		return employeeFunction.getAllEmployeeRegion(region);
	}
	@GetMapping("/getfirtsnameStartswith")
	public List<Employee> findByname(@RequestParam String name){
		return employeeFunction.findByName(name);
	}
	@GetMapping("/salary")
	public List<Employee> getAllbySalaryGreaterThan(@RequestParam int salary){
		return employeeFunction.getAllbySalaryGreaterThan(salary);
	}
	
	
	@RequestMapping("/getFirstName")
	public List<Employee> getByName(@RequestParam String name) {
		
		return employeeFunction.findByNameStartingWith(name);
	}

}

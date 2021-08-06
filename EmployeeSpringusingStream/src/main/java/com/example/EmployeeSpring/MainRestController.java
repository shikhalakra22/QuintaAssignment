package com.example.EmployeeSpring;
import com.example.EmployeeSpring.EmployeeData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.EmployeeSpring.Employee;

@RestController
public class MainRestController {
	@Autowired
	private EmployeeData employeeData;
	@RequestMapping("/")
	@ResponseBody
	public String welcome() {
		return "Doing all the opertaion";
	}
	
	@RequestMapping(value="/listEmployeeslessequal")
	public List<String>  getlist(@RequestParam int age, @RequestParam String region) {
		return employeeData.getlist(age,region);
	}
	@RequestMapping(value="/getregion",method=RequestMethod.GET)
	public List<String>  getregion(@RequestParam String region) {
		return employeeData.getregion(region);
	}
	@RequestMapping(value="/getalpha",method=RequestMethod.GET)
	public List<String>  getalpha(@RequestParam String s) {
		return employeeData.getalpha(s);
	}
	@RequestMapping(value="/listEmployeessal",method=RequestMethod.GET)
	public List<String>  getsal(@RequestParam int val) {
		return employeeData.getsal(val);
	}
	@RequestMapping(value="/listEmployeelen",method=RequestMethod.GET)
	public List<String>  getlen(@RequestParam int val) {
		return employeeData.getlen(val);
	}
	
	
	@RequestMapping(value="/Average",method=RequestMethod.GET)
	public double  getavg() {
		return EmployeeData.getAverageValue();
	}
	
	@RequestMapping(value="/Averagemore",method=RequestMethod.GET)
	public List<String> getmore() {
		double avg = EmployeeData.getAverageValue();
		return employeeData.getmore(avg);
	}
	@RequestMapping(value="/Averageless",method=RequestMethod.GET)
	public List<String> getless() {
		double avg = EmployeeData.getAverageValue();
		return employeeData.getless(avg);
	}
	@RequestMapping(value="/HighestSalary",method=RequestMethod.GET)
	public int highest() {
		return EmployeeData.maxsal();
	}
	@RequestMapping(value="/LowestSalary",method=RequestMethod.GET)
	public int lowest() {
		return EmployeeData.minsal();
	}

	
	

}

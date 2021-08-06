package com.example.EmployeeSpring;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import  com.example.EmployeeSpring.Employee;;
@Service
public class EmployeeData {
	public static List<Employee> list = new ArrayList<Employee>();
	static {
		initEmps();
	}
	public static void initEmps() {
		list.add(new Employee("jade",10000,24,"bangalore"));
	     list.add(new Employee("judy",11000,25,"delhi"));
	     list.add(new Employee("dexter",20000,26,"mumbai"));
	     list.add(new Employee("suzy",23000,22,"delhi"));
	     list.add(new Employee("lex",5000,34,"bangalore"));
	     list.add(new Employee("john",45000,33,"delhi"));
	     list.add(new Employee("danish",25000,32,"bangalore"));
	     list.add(new Employee("dinesh",32000,30,"bangalore"));
	     list.add(new Employee("rajesh",48000,27,"mumbai"));
 
		
	}

	    public  List<String> getlist(int ag,String re) {
	    	list.stream();
	    	List<Employee> temp = list.stream().filter(Employee -> Employee.age < ag && Employee.region.equals(re)).collect(Collectors.toList());
	    	List<String> names = new ArrayList<>();
	    	for(Employee i:temp) {
				names.add(i.name);
			}
			return names;
	    }

	    public List<String> getregion(String re) {
	    	List<Employee> temp = list.stream().filter(Employee -> Employee.region.equals(re)).collect(Collectors.toList());
	    	List<String> names = new ArrayList<String>();
	    	for(Employee i:temp) {
				names.add(i.name);
			}
			return names;
	    
	    }
	    public List<String> getalpha(String s) {
	    	List<String> names = new ArrayList<String>();
	    	List<Employee> temp = list.stream().filter(Employee -> Employee.name.startsWith(s)).collect(Collectors.toList());
	    	for(Employee i:temp) {
				names.add(i.name);
			}
			return names;
	    	
	    }
	    public List<String> getsal(int val) {
	    	List<Employee> temp = list.stream().filter(x -> x.salary >val).collect(Collectors.toList());

	    	List<String> names = new ArrayList<String>();
	    	for(Employee i:temp) {
				names.add(i.name);
			}
	    	
			return names;
	    }
	    public List<String> getsec() {
	    	
	    	List<String> names = new ArrayList<String>();
	    	for(int i=0; i < list.size();i++ )
		       {
		           
	    		names.add(list.get(i).getName());
		           
		       }
			return names;
	    }
	    public List<String> getlen(int val) {
	    	List<Employee> temp = list.stream().filter(Employee -> Employee.name.length()>val).collect(Collectors.toList());

	    	List<String> names = new ArrayList<String>();
	    	for(Employee i:temp) {
				names.add(i.name);
			}
	    	
			return names;
	    }
	    public static  double getAverageValue(){

	    	double sum = list.stream().map(e->e.salary).reduce(0,(x,y)-> x+y);
	    	double averageValue = sum/list.size();
	    	return averageValue;
	  	}
	    public List<String> getmore(double avg) {
	    	List<String> names = new ArrayList<String>();
	    	List<Employee> st = list.stream().filter(x -> x.salary >avg).collect(Collectors.toList());
			for(Employee i:st) {
				names.add(i.name);
			}
	
	    	return names;
	    		
	    }
	    public List<String> getless(double avg) {
	    	List<String> names = new ArrayList<String>();

	    	List<Employee> st = list.stream().filter(x -> x.salary <avg).collect(Collectors.toList());
			for(Employee i:st) {
				names.add(i.name);
			}
	    	
			return names;
	    }
	
		
		
		public static int maxsal() {
			System.out.print("The highest salary is: ");

			int sal = list.stream().map(e -> e.salary).min(Integer::compare).get();
			return sal;
		}

		
		public static int minsal() {
			System.out.print("The lowest salary is: ");

			int sal = list.stream().map(e -> e.salary).min(Integer::compare).get();
			return sal;
		}
}

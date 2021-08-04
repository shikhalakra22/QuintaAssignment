package com.example.EmployeeSpring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import  com.example.EmployeeSpring.Employee;;
@Service
public class EmployeeData {
	public static final List<Employee> list = new ArrayList<Employee>();
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
	
	    public List<String> getlist(int ag,String re) {
	    	List<String> names = new ArrayList<String>();
	    	for(int i=0; i < list.size();i++ )
		       {
		           if(list.get(i).age < ag && list.get(i).region.equals(re))
		           {
		              names.add(list.get(i).getName());
		           }
		           else{

		           }
		       }
			return names;
	    }
	    public List<String> getregion(String re) {
	    	List<String> names = new ArrayList<String>();
	    	for(int i=0; i < list.size();i++ )
		       {
		           if(list.get(i).region.equals(re))
		           {
		        	   names.add(list.get(i).getName());
		           }
		           else{

		           }
		       }
			return names;
	    
	    }
	    public List<String> getalpha(String s) {
	    	List<String> names = new ArrayList<String>();
	    	for(int i=0; i < list.size();i++ )
		       {
		           if(list.get(i).name.startsWith(s))
		           {
		        	   names.add(list.get(i).getName());
		           }
		           else{

		           }
		       }
			return names;
	    	
	    }
	    public List<String> getsal(int val) {
	    	List<String> names = new ArrayList<String>();
	    	for(int i=0; i < list.size();i++ )
		       {
		           if(list.get(i).salary > val)
		           {
		        	   names.add(list.get(i).getName());
		           }
		           else{

		           }
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
	    	List<String> names = new ArrayList<String>();
	    	for(int i=0; i < list.size();i++ )
		       {
		           if(list.get(i).name.length()>val)
		           {
		        	   names.add(list.get(i).getName());
		           }
		           else{

		           }
		       }
			return names;
	    }
	    public static  double getAverageValue(){
	  	  double averageValue = 0;
	  	  double sum = 0;

	  	  if(list.size() > 0){
	  	    for ( int i=0; i < list.size() ; i++) {
	  	      // assuming the product class has a price
	  	      sum += list.get(i).getSalary();
	  	    }
	  	    averageValue = (sum / (double)list.size());
	  	  }

	  	  return averageValue;
	  	}
	    public List<String> getmore(double avg) {
	    	List<String> names = new ArrayList<String>();
	    	for(int i=0; i < list.size();i++ )
		       {
		           if(list.get(i).salary > avg)
		           {
		        	   names.add(list.get(i).getName());
		           }
		           else{

		           }
		       }
			return names;
	    }
	    public List<String> getless(double avg) {
	    	List<String> names = new ArrayList<String>();
	    	for(int i=0; i < list.size();i++ )
		       {
		           if(list.get(i).salary < avg)
		           {
		        	   names.add(list.get(i).getName());
		           }
		           else{

		           }
		       }
			return names;
	    }
		public List<String> getnamelist() {
//			// TODO Auto-generated method stub
			List<String> names = new ArrayList<String>();
			for (Employee l : list) {
				if (30 < l.age) {
					names.add(l.name);
				}
			}
			return names;
			
		}
		
		
		public static int maxsal() {
			System.out.print("The highest salary is: ");
			int i = 0;
			for (Employee l : list) {
				if (i < l.salary) {
					i = l.salary;
				}
			}
			return i;
		}

		
		public static int minsal() {
			System.out.print("The lowest salary is: ");
			int i = Integer.MAX_VALUE;
			for (Employee l : list) {
				if (i > l.salary) {
					i = l.salary;
				}

			}
			return i;
		}
}

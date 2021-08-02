package com.example.EmployeeSpring;

public class Employee {
	public int age;
    public String name;
    public String region;
    public int salary;   
    
    public Employee() {
    	
    }
    
    public Employee(String name,int salary, int age, String region)
    {
        
        
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.region=region;
    }
    public int getage() {
        return age;
    }
    public void setage(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public String getRegion(String region) {
    	return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

}

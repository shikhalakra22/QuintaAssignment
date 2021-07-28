import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class operation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//    
        
        List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("jade",10000,24,"bangalore"));
	     list.add(new Employee("judy",11000,25,"delhi"));
	     list.add(new Employee("dexter",20000,26,"mumbai"));
	     list.add(new Employee("suzy",23000,22,"delhi"));
	     list.add(new Employee("lex",5000,34,"bangalore"));
	     list.add(new Employee("john",45000,33,"delhi"));
	     list.add(new Employee("danish",25000,32,"bangalore"));
	     list.add(new Employee("dinesh",32000,30,"bangalore"));
	     list.add(new Employee("rajesh",48000,27,"mumbai"));
	     Employee maxSal = Collections.max(list);
       System.out.println("Employee with max salary: "+maxSal);
       
       Employee minsal = Collections.min(list);
       System.out.println("Employee with min salary: "+minsal);
     
       
      
       
//       
	}
//



}
class Employee implements Comparable<Employee>{
    
   
    private String name;
    private Integer salary;
    private Integer age;
    
    private String region;
     
    public Employee(String name, Integer sal,Integer age, String region){
       
        this.name = name;
        this.salary = sal;
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
    @Override
    public int compareTo(Employee emp) {
         
        return this.salary.compareTo(emp.getSalary());
    }
    public String toString(){
        return name+"   "+salary;
    }
    public int compareT(Employee emp) {
    	return this.age.compareTo(30);
    }
  
    
    
    
}
 
import java.util.*;
public class Employee {
	public int age;
    public String name;
    public String region;
    public int salary;
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
//    public int compareTo(Employee emp) {
//         
//        return this.salary.compareTo(emp.getSalary());
//    }
//    public String toString(){
//        return name+"   "+salary;
//    }
	public static  double getAverageValue(List<Employee> list ){
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	   //  Employee max = Collections.max(list);
	     System.out.println("all employees whose age is greater than 30\n"
	     		);
	     for(int i=0; i < list.size();i++ )
	       {
	           if(list.get(i).age > 30)
	           {
	              System.out.println(list.get(i).getName());
	           }
	           else{

	           }
	       }
	     int maxsal=Integer.MAX_VALUE;
	     for(int i=0;i<list.size();i++) {
	    	 if(list.get(i).salary>maxsal) {
	    		 maxsal = list.get(i).getSalary();

	}}
	    	 System.out.printf("ArrayList max value : ",maxsal);
	    	 System.out.println("list of employees whose age<30 and region is bangalore");
	    	 for(int i=0; i < list.size();i++ )
		       {
		           if(list.get(i).age < 30 && list.get(i).region.equals("bangalore"))
		           {
		              System.out.println(list.get(i).getName());
		           }
		           else{

		           }
		       }
	    	 
	    	 System.out.println("all employees belonging to one particular region e.g. Bangalore\n"
	    	 		+ "");
	    	 
	    	 for(int i=0; i < list.size();i++ )
		       {
		           if(list.get(i).region.equals("bangalore"))
		           {
		              System.out.println(list.get(i).getName());
		           }
		           else{

		           }
		       }
	    	 System.out.println(" employees whose name begin with a given alphabet “J”\n"
	    	 		);
	    	 for(int i=0; i < list.size();i++ )
		       {
		           if(list.get(i).name.startsWith("j"))
		           {
		              System.out.println(list.get(i).getName());
		           }
		           else{

		           }
		       }
	    	 System.out.println("list of employees with salary > 11000");
	    	 for(int i=0; i < list.size();i++ )
		       {
		           if(list.get(i).salary > 11000)
		           {
		              System.out.println(list.get(i).getName());
		           }
		           else{

		           }
		       }
	    	 System.out.println("2nd aphabet of the names in the employee");
	    	 for(int i=0; i < list.size();i++ )
		       {
		           
		              System.out.println(list.get(i).getName().charAt(1));
		           
		       }
	    	 System.out.println("list of employee with length > 5");
	    	 for(int i=0; i < list.size();i++ )
		       {
		           if(list.get(i).name.length()>5)
		           {
		              System.out.println(list.get(i).getName());
		           }
		           else{

		           }
		       }

		
		 System.out.println("Average value of the salary");
	    	 double avg = getAverageValue(list);
	    	 System.out.println(avg);

	    	 System.out.println("Salaries greater than Average salary are: ");
	    	 for(int i=0; i < list.size();i++ )
		       {
		           if(list.get(i).salary > avg)
		           {
		              System.out.println(list.get(i).getName());
		           }
		           else{

		           }
		       }
	    	 System.out.println("Salaries Smaller than Average salary are: ");
	    	 for(int i=0; i < list.size();i++ )
		       {
		           if(list.get(i).salary < avg)
		           {
		              System.out.println(list.get(i).getName());
		           }
		           else{

		           }
		       }
	    	 
	     
}
}

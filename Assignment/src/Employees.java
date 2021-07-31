import java.util.ArrayList;
import java.util.List;

public class Employees {
	public int age;
    public String name;
    public String region;
    public int salary;   
    
    public Employees(String name,int salary, int age, String region)
    {
        
        
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.region=region;
    }
    public static void getnamelist(List<Employee> list) {
    	for(int i=0; i < list.size();i++ )
	       {
	           if(list.get(i).age > 30)
	           {
	              System.out.println(list.get(i).getName());
	           }
	           else{

	           }
	       }
    	
    }
    public static void getlist(List<Employee> list) {
    	for(int i=0; i < list.size();i++ )
	       {
	           if(list.get(i).age < 30 && list.get(i).region.equals("bangalore"))
	           {
	              System.out.println(list.get(i).getName());
	           }
	           else{

	           }
	       }
    }
    public static void getregion(List<Employee> list) {
    	for(int i=0; i < list.size();i++ )
	       {
	           if(list.get(i).region.equals("bangalore"))
	           {
	              System.out.println(list.get(i).getName());
	           }
	           else{

	           }
	       }
    
    }
    public static void getalpha(List<Employee> list) {
    	for(int i=0; i < list.size();i++ )
	       {
	           if(list.get(i).name.startsWith("j"))
	           {
	              System.out.println(list.get(i).getName());
	           }
	           else{

	           }
	       }
    	
    }
    public static void getsal(List<Employee> list) {
    	for(int i=0; i < list.size();i++ )
	       {
	           if(list.get(i).salary > 11000)
	           {
	              System.out.println(list.get(i).getName());
	           }
	           else{

	           }
	       }
    }
    public static void getsec(List<Employee> list) {
    	for(int i=0; i < list.size();i++ )
	       {
	           
	              System.out.println(list.get(i).getName().charAt(1));
	           
	       }
    }
    public static void getlen(List<Employee> list) {
    	for(int i=0; i < list.size();i++ )
	       {
	           if(list.get(i).name.length()>5)
	           {
	              System.out.println(list.get(i).getName());
	           }
	           else{

	           }
	       }
    }
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
    public static void getmore(List<Employee> list,double avg) {
    	for(int i=0; i < list.size();i++ )
	       {
	           if(list.get(i).salary > avg)
	           {
	              System.out.println(list.get(i).getName());
	           }
	           else{

	           }
	       }
    }
    public static void getless(List<Employee> list,double avg) {
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
	     
	     System.out.println("all employees whose age is greater than 30\n");
	     getnamelist(list);
	     System.out.println("list of employees whose age<30 and region is bangalore");
	     getlist(list);
	     System.out.println("all employees belonging to one particular region e.g. Bangalore\n"
	    	 		+ "");
	     getregion(list);
	     System.out.println(" employees whose name begin with a given alphabet “J”\n"
	    	 		);
	     getalpha(list);
	     System.out.println("list of employees with salary > 11000");
	     getsal(list);
	     System.out.println("2nd aphabet of the names in the employee");
	     getsec(list);
	     System.out.println("list of employee with length > 5");
	     getlen(list);
	     System.out.println("Average value of the salary");
    	 double avg = getAverageValue(list);
    	 System.out.println(avg);
    	 System.out.println("Salaries greater than Average salary are: ");
    	 getmore(list,avg);
    	 System.out.println("Salaries Smaller than Average salary are: ");
    	 getless(list,avg);
	     
	     

	}

}

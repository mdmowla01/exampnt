package employee.info.system;

public class EmployeeInfo  implements Employee{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName="PeopleNTech";
	final double increment=0.5;
	
	
	private int employeeID;
	private String name;
	private int salary;
	private int basicsalary;
	private int otherssalary;
	private int benifit;
	
	private String department;
	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	
	//Concrete Class Constructor
	 /*  public EmployeeInfo(int employeeID){
		
		this.employeeID=employeeID;
	   }*/
	
    
	public EmployeeInfo(String name, int employeeID, String department){
		this.name=name;
		this.employeeID=employeeID;
		
		this.department=department;
		System.out.println("This is from Concrete class");
		
		
	}
	
	// Implements all the declared method of interface and overridden concept
	
	   //employeeId() will return employee id.
	   //overridden
		
	    public  int employeeId()
		{
	    	return employeeID;
		}
		
		//employeeName() will return employee name
	    //Overridden
		public String employeeName()
		{
		  return name;
			
		}
		
		//assignDepartment() will assign employee to departments
		//Overridden
	    public void assignDepartment()
	    {
	       System.out.println("Employee's Department: " +department);
	    }
		
		//calculate employee salary
	    //Overridden
		public int calculateSalary()
		{
			salary=basicsalary+otherssalary;
			return salary;
		}
		
		//employee benefit
		//overridden
		public void benefitLayout()
		{
			benifit=(int) (basicsalary *.01);
		}
		
		
		
		public int CalculateOtherIncome()
		{
		   
		}
	
		
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeBonus(){
		int total=0;
		return total;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployePension(){
		int total=0;
		return total;
	}
	
	
}

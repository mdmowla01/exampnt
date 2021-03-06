package employee.info.system;

public class EmployeeInfo extends EmployeeAbstract implements Employee{
	
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
	final int increment=50000;
	
	
	private int employeeID;
	private String name;
	private int salary;
	private int jobsyear;
	private int monthlySalary;
	private String performance;
	
	private int pension;
	
	
	
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
	
	 
	 public EmployeeInfo(int monthlySalary, String performance,int jobsyear){
		    super(monthlySalary,performance);
		    this.monthlySalary=monthlySalary;
		    this.performance=performance;
		    this.jobsyear=jobsyear;
		    
		    
		 }
	 	 
	public EmployeeInfo(String name, int employeeID, String department){
	    super();
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
			
			
			salary=monthlySalary*12;
			return salary;
		}
		
		//employee benefit
		//overridden
		public void benefitLayout()
		{
			System.out.println("Benefit Layout:");
			
		}
		
				
		
		
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	/*public static int calculateEmployeBonus(int monthlySalary, String performance){
		
		totalSalary=montlySalary*12;
		int total=0;
		return total;
	}*/
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public int calculateEmployepension(){
		pension=0;
		if(jobsyear==1)
		{
			pension=(int) (monthlySalary * .05);
		}
		if(jobsyear==2)
		{
			pension=(int) (monthlySalary * .10);
		}
		else
			pension=(int) (monthlySalary * .20);
						  
		return pension;
	}
	
	public void comparison()
	{
	   
		System.out.println("Increment: "+increment);
	}
	
	
}

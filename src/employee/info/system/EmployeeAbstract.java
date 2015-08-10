package employee.info.system;

public abstract class EmployeeAbstract {

	private int monthlySalary;
	private int totalSalary;
	private String performance;
	
	/*public EmployeeAbstract(String name, int employeeID)
	{
	    this.name=name;
	    this.employeeID=employeeID;
	    System.out.println("This is from AbstratClass");
		
	}*/
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	
	public EmployeeAbstract()
	{
	    
	}
	
	
	public EmployeeAbstract(int monthlySalary,String performance)
	{
	    this.monthlySalary=monthlySalary;
	    this.performance=performance;
	}
	
	public int getmontlySalary()
	{
	  return monthlySalary;
	}
	
	public String getperformance()
	{
	  return performance;
	}
	
	
	
	
	
	public  int calculateEmployeBonus(){
		int bonus=0;
		totalSalary=monthlySalary*12;
		if(performance.equals("best"))
		{
		 bonus=(int) (totalSalary*.10);
		 		 
		}
		if (performance.equals("average"))
		{
			bonus=(int) (totalSalary*.08);  	
		}
		
		return bonus;
	}
	
	
	public static void  motivation()
	{
	  System.out.println("Good Job");
	}
	
	public void comparison()
	{
	  System.out.println("Increment:");
	}
	
	
	public  abstract int calculateEmployepension();
	

	
}
	
	

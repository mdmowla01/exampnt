package employee.info.system;

public abstract class EmployeeAbstract {

	private String name;
	private int employeeID;
	
	public EmployeeAbstract(String name, int employeeID)
	{
	    this.name=name;
	    this.employeeID=employeeID;
	    System.out.println("This is from AbstratClass");
		
	}
	
	
	
	
	public abstract int calculateEmployeBonus();

	
}
	
	

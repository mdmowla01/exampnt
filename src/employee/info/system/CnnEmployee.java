package employee.info.system;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from 
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * 
	 **/
	public static void main(String[] args) {
		
	/*	
		EmployeeInfo emp= new EmployeeInfo("Masud",10,"Address");
		emp.assignDepartment();
		emp.benefitLayout();
		emp.employeeId();
		
		Employee emp1=new EmployeeInfo("Masud",10,"Address");
		int id=emp1.employeeId();
		int id1=emp.employeeId();
		System.out.println(id);
		System.out.println(id1);*/
		
		EmployeeInfo emp= new EmployeeInfo("Md.Taherul Mowla",208496,"Software Department");
		
		// Polymorphism concept
		
		EmployeeAbstract abs= new EmployeeInfo(10000,"best",2);
		EmployeeInfo emp1 =new EmployeeInfo(10000,"best",2);
		
		System.out.println("Employees Name: "+emp.employeeName());
		emp.assignDepartment();
		System.out.println("Employees ID: "+emp.employeeId());
		System.out.println("Company Name: "+EmployeeInfo.companyName);
		System.out.println("Salary Sheet");
		System.out.println("==============");
		
		
		System.out.println("Yearly Salary: $"+ emp1.calculateSalary());
		
		emp.benefitLayout();
			
		
		int result = abs.calculateEmployeBonus();
		System.out.println("Yearly Bonus: "+result);
		
		int pension = emp1.calculateEmployepension();
		System.out.println("Yearly Pension: "+pension);
		
		abs.comparison();
		EmployeeAbstract.motivation();
		

	}

}

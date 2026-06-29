package assignmentJavaBasics;

public class OverloadOverrideEmployeeTest {
	
	public static void main(String[] args) {
	
		OverloadOverrideEmployee emp = new OverloadOverrideEmployee();
         System.out.println("Employee Basic Salary: " + emp.calculateSalary(50000));
         System.out.println("Employee Salary with Allowances: " + emp.calculateSalary(50000, 5000));

        OverloadOverrideEmployeeManager mgr = new OverloadOverrideEmployeeManager();
         System.out.println("Manager Salary with Incentives: " + mgr.calculateSalary(50000, 5000));
 }

}

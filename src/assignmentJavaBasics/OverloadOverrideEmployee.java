package assignmentJavaBasics;

/* Combined Overloading + Overriding
Employee Salary
Base class Employee with overloaded calculateSalary() methods (basic + allowances).
Child class Manager overrides calculateSalary() to include incentives.
*/

class OverloadOverrideEmployee {
	
    // Method 1 - basic salary
    double calculateSalary(double basicSalary) {

        return basicSalary;
    }

    // Method 2 - salary with allowances
    double calculateSalary(double basicSalary,
                           double allowances) {

        return basicSalary + allowances;
    }

}

package assignmentJavaBasics;

public class OverloadOverrideEmployeeManager extends OverloadOverrideEmployee {
	
	 // Overriding parent method
    @Override
    double calculateSalary(double basicSalary,
                           double allowances) {

        double incentives = 10000;

        return basicSalary + allowances + incentives;
    }
	

}

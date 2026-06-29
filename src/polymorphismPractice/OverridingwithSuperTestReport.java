package polymorphismPractice;

public class OverridingwithSuperTestReport extends OverridingwithSuperReport {

	   @Override
	    void generateReport() {
	    	
	        super.generateReport();
	        
	        System.out.println("Adding test execution details");
	    }

}

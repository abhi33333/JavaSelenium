package polymorphismPractice;

/*Overriding with super: child can reuse parent method and add extra behavior.
1.Create parent class Report.
Method:
      generateReport()
2. Create child class TestReport.
   Inside child method:
      super.generateReport();
   Then add child-specific print statement.
*/
class OverridingwithSuperReport {
	
	 void generateReport() {
	        System.out.println("Generating basic report");
	    }

}

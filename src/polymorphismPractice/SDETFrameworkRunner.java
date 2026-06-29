package polymorphismPractice;

public class SDETFrameworkRunner {
	
	 public static void main(String[] args) {

		 SDETFrameworkBaseTest test;

	        test = new SDETFrameworkLoginTest();
	        test.startTest();

	        test = new SDETFrameworkSearchTest();
	        test.startTest();

	        test = new SDETFrameworkPaymentTest();
	        test.startTest();

}
}

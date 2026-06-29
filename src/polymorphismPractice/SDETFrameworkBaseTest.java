package polymorphismPractice;

/*SDET Framework Problem: same test runner can execute different tests.
  1. Create class BaseTest with method:
          startTest()
  2. Create child classes:
          LoginTest
          SearchTest
          PaymentTest
          Each test class overrides startTest().
   3. In main() create:
           BaseTest test = new LoginTest();
                 test.startTest();
         Then switch object to SearchTest and PaymentTest.
 * */

public class SDETFrameworkBaseTest {
	
	void startTest() {
        System.out.println("Starting base test");
    }

}

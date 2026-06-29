package demoTestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario2 {
	
	@Test
	
	public void first_testcase() {
	
		System.out.println("first_testcase_step1");
		Assert.assertEquals("Hello", "Hello"); //pass //hard assertion
		
		System.out.println("first_testcase_step2");
		Assert.assertEquals("Hello", "Hello Testng"); //fail
		
		System.out.println("first_testcase_step3");
		Assert.assertEquals("Hello", "Hello Testng");
	}
	
    @Test(enabled=false)
	public void second_testcase() {
		
		System.out.println("second_testcase");
		Assert.assertEquals("Hello", "Hello Testng12");
	}
    
    @Test
	public void registration() {
		
		System.out.println("registration step 1");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Hello",  "Hello");
		
		System.out.println("registration step 2");
		sa.assertEquals("Hello",  "Hello Testng");
		
		System.out.println("registration step 3");
		sa.assertEquals("Hello",  "Hello");
		
		sa.assertAll();
	}
    
    @Test(dependsOnMethods="registration")
	public void login() {
		
		System.out.println("login");
	}
    
    @Test(groups={"Sanity", "Regression"})
  	public void five_testcase() {
  		
  		System.out.println("fifth_testcase");
  	}
    @Test(groups={"Sanity", "Regression"})
  	public void six_testcase() {
  		
  		System.out.println("sixth_testcase");
  	}
}

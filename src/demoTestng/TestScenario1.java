package demoTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario1 {
	
	@Test(priority=1)
	
	public void first_testcase() {
		
		System.out.println("first_testcase");
		
		Assert.assertEquals("Hello", "Hello");
	}
	
    @Test(priority=3)
	public void second_testcase() {
		
		System.out.println("second_testcase");
	}
    
    @Test(priority=2)
	public void third_testcase() {
		
		System.out.println("third_testcase");
	}
    
    @Test(priority=0)
	public void fourth_testcase() {
		
		System.out.println("fourth_testcase");
	}
    
    @Test
  	public void five_testcase() {
  		
  		System.out.println("fifth_testcase");
  	}
    @Test(priority=-1)
  	public void six_testcase() {
  		
  		System.out.println("sixth_testcase");
  	}
}

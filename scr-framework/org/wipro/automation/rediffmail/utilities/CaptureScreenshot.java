package org.wipro.automation.rediffmail.utilities;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	
	public static void testresult(WebDriver driver, String name) throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot) driver;//take screenshot. This is interface so have to do this way. we have to cast
		
		File f = ts.getScreenshotAs(OutputType.FILE); //temp store the file
		//File fd = new File("./screenshot/sprint1/test.png"); //location to put the screenshot
		File fd = new File("./screenshot/sprint1/test.png" + name + ".png"); //location to put the screenshot with the name of the test case
	
		FileUtils.copyFile(f, fd); //take from temp place to actual location to store screnshots| copy from f to fd		
		//CaptureScreenshot.testresult(driver, name);
	}
	
	

}

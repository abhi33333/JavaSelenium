package polymorphismPractice;

public class PolySeleniumWebDriverTest {

	 public static void main(String[] args) {

		 PolySeleniumWebdriver driver;

	        driver = new PolySeleniumWebDiverChrome();
	        driver.launchBrowser();

	        driver = new PolySeleniumWebDiverFirefox();
	        driver.launchBrowser();

	        driver = new PolySeleniumWebDiverEdge();
	        driver.launchBrowser();
	    }
	}

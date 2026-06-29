package polymorphismPractice;
/*  Concept: Selenium uses this idea.
 * 1. Create an interface PolySeleniumWebDriver with method:
        launchBrowser()
   2. Create classes: PolySeleniumChromeDriver, PolySeleniumFirefoxDriver, PolySeleniumEdgeDriver
       Each class should implement launchBrowser() differently.
   3. In (PolySeleniumWebDriverTest) main():
           PolySeleniumWebDriver driver = new PolySeleniumChrome();
           driver.launchBrowser();
*/


interface PolySeleniumWebdriver {
	
	  void launchBrowser();

}

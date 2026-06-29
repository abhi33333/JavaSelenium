package abstraction;

public class selInterfaceStyleDriverTest {
	
	public static void main(String[] args) {

		selInterfaceStyleDriverWebDriver driver;

        driver = new selInterfaceStyleDriverChrome();
        driver.openBrowser();

        driver = new selInterfaceStyleDriverFirefox();
        driver.openBrowser();
    }

}

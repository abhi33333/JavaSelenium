package encapAbstract;

public class selInterfaceStyleDriverBrowserManager implements selInterfaceStyleDriverBrowserActions{
	
	private String browserName;

    public selInterfaceStyleDriverBrowserManager(String browserName) {

        this.browserName = browserName;
    }

    public void launchBrowser() {

        System.out.println("Launching " + browserName);
    }
}
	
	


package polymorphismPractice;

class OverridingBrowserChrome extends OverridingBrowser {
	
	@Override
    void open() {
        System.out.println("Open Chrome browser");
    }
	

}

package polymorphismPractice;

public class OverridingBrowserTest {

    public static void main(String[] args) {

    	OverridingBrowserChrome chrome = new OverridingBrowserChrome();
    	OverridingBrowserFirefox firefox = new OverridingBrowserFirefox();
    	OverridingBrowserEdge edge = new OverridingBrowserEdge();

        chrome.open();
        firefox.open();
        edge.open();
    }
}
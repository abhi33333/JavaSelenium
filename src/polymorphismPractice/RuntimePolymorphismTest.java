package polymorphismPractice;

/*Runtime Polymorphism:  parent reference, child object.
   Using the same browser example, write:
                    Browser b = new ChromeBrowser();
                                 b.open();
   Then change it to:
                     Browser b = new FirefoxBrowser();
                                 b.open();
   Observe how same reference b gives different output.
 */

public class RuntimePolymorphismTest {

	public static void main(String[] args) {

        OverridingBrowser b; //Parent reference, child object.

        b = new OverridingBrowserChrome();
        b.open();

        b = new OverridingBrowserFirefox();
        b.open();

        b = new OverridingBrowserEdge();
        b.open();
    }
}
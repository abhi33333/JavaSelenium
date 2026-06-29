package polymorphismPractice;
/* Method Overriding: child changes parent method behavior.
   1. Create a parent class Browser with method: open()
   2. Create child classes: ChromeBrowser, FirefoxBrowser, EdgeBrowser
      Each child class should override open() and 
      3. print its own browser name.
 */

class OverridingBrowser {
	void open() {
		
		System.out.println("Open browser");
	}

}

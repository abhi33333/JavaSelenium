package overriding;

/* Method Overriding
1. Create a parent class Browser with method open().
2. Create child class ChromeBrowser that overrides open() method.
3. Create object and call method to observe overriding.
*/

public class Browser {
	void open() {
        System.out.println("Open browser");
    }
}

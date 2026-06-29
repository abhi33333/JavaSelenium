package polymorphismPractice;

public class OverridingBrowserFirefox extends OverridingBrowser {
	
	@Override
    void open() {
        System.out.println("Open Firefox browser");
    }

}

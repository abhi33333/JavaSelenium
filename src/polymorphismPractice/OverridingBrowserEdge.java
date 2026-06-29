package polymorphismPractice;

public class OverridingBrowserEdge extends OverridingBrowser {
	
	@Override
    void open() {
        System.out.println("Open Edge browser");
    }

}

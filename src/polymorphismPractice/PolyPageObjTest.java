package polymorphismPractice;

public class PolyPageObjTest {
	
	public static void main(String[] args) {

        PolyPageObjBasePage page;

        page = new PolyPageObjLoginPage();
        page.clickButton();

        page = new PolyPageObjHomePage();
        page.clickButton();

        page = new PolyPageObjCartPage();
        page.clickButton();
    }

}

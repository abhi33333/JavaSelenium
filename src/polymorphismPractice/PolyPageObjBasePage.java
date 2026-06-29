package polymorphismPractice;
/*Page Object Polymorphism: same method name, different page behavior.
Problem:
1.Create parent class BasePage with method clickButton(). 
2.Create child classes LoginPage, HomePage, and CartPage. 
   Each child should override clickButton().*/
class PolyPageObjBasePage {
	
	    void clickButton() {
	        System.out.println("Clicking a generic button");
	    }
	}



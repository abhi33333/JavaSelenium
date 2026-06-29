package encapsulation;

/* Concept: Hide WebElements from outside classes.
   Problem:  Create class LoginPage.
             Hide login button and expose method to click it.
 */

class encapSeleniumLoginPage {
	
	private String loginButton = "Login Button";

    public void clickLoginButton() {
        System.out.println("Clicking " + loginButton);
    }

}

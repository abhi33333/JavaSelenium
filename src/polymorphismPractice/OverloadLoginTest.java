package polymorphismPractice;

public class OverloadLoginTest {


	    public static void main(String[] args) {

	        OverloadLogin loginObj = new OverloadLogin();

	        loginObj.login("aditi", "password123");
	        loginObj.login("aditi@gmail.com", 4567);
	        loginObj.login(9876543210L, 1234);
	    }

}

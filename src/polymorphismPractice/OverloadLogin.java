package polymorphismPractice;
/* Polymorphism: same action, different input types.
 * Method Overloading with Login
      1.Create a class OverloadLogin.
      2. Write overloaded methods:
                     login(String username, String password)
                     login(String email, int otp)
                     login(long phoneNumber, int otp)
      3. Print which login type is used.
*/
class OverloadLogin {

	    void login(String username, String password) {
	        System.out.println("Login using username and password");
	    }

	    void login(String email, int otp) {
	        System.out.println("Login using email and OTP");
	    }

	    void login(long phoneNumber, int otp) {
	        System.out.println("Login using phone number and OTP");
	    }
	}


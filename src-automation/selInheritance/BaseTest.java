package selInheritance;

/*
 * Real Selenium Style Inheritance
1. Create a parent class BaseTest with methods setup() and closeBrowser().
2. Create child class LoginTest inheriting from BaseTest with method login().
3. Create object and execute all methods to simulate Selenium test framework behavior.
 */
class BaseTest {

    void setup() {

        System.out.println("Launch browser");
    }

    void closeBrowser() {

        System.out.println("Close browser");
    }
}


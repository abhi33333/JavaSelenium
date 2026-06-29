package polymorphismPractice;


/* Expert Level Problem: real automation frameworks use this style for browser setup.
   1. Create interface DriverManager.
      Method:
           createDriver()
   2. Create classes:
               ChromeDriverManager
               FirefoxDriverManager
               EdgeDriverManager
       Each class creates its own driver message.
   3.  In main(), use:
         DriverManager manager = new ChromeDriverManager();
                       manager.createDriver();
*/

interface ExDriverManager {
	
	 void createDriver();

}

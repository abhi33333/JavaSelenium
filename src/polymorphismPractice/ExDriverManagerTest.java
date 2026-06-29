package polymorphismPractice;

public class ExDriverManagerTest {
	
	 public static void main(String[] args) {
		 
		 ExDriverManager man;
		 
		 man = new ExDriverManagerFirefoxDriverMan();
		 man.createDriver();
		 
		 man = new ExDriverManagerEdgeDriverMan();
		 man.createDriver();
		 
		 man = new ExDriverManagerChromeDriverMan();
		 man.createDriver();
		 
	
	 }
}

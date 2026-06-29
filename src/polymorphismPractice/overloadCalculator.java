package polymorphismPractice;
/* Polymorphism: same method name, different parameters.
 * 1. Create a class overloadCalculator. 
        Write overloaded methods:
                          add(int a, int b)
                          add(int a, int b, int c)
                          add(double a, double b)
   2. Call all 3 methods from main() and print results.
 */

class overloadCalculator {

	    int add(int a, int b) {
	        return a + b;
	    }

	    int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    double add(double a, double b) {
	        return a + b;
	    }
	}	
	
	
	
	
	
	
	



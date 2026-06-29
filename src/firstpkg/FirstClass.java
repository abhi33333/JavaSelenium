package firstpkg;


public class FirstClass {
	    
	String j = "This is an example of instance variable"; //Declared inside a class but outside methods.
	static String k = "This is an example of static variable"; // static variables belongs to the class and shared among all objects
	
	public void local_variable() {
		// All following variables are local variables because its declared inside a method.
		//integer types
		byte a = 25;
		short b = 26;
		int c= 100;
		long d = 1000l;
		
		//Float point types
		float e = 10.5f;
		double f = 3.1234;
		
		//character
		char g = 'c';
		
		//boolean
		boolean h = true;
		
		//String
		String i = "Hello World";
	   
		//Print integer types
		System.out.println("Local variables");
		System.out.println("1. Integer variables example: "  + "byte a = "+ a + ", " + "short b = " + b + ", " + "int c = "+ c + ", " + "long d = " + d);
		
		//Print floating point types
		System.out.println("2. Floating types example: " + "float e = " + e + ", " + "double f = " + f);
	
		//Print character 
		System.out.println("3. Character example: " + "char= " + g);
		
		//Print boolean
		System.out.println("4. Boolean example: " + "boolean h = " + h);
		
		//Print String
		System.out.println("5. String example: " + "String i = " + i);
		System.out.println();
		
		
	}

	public static void main(String[] args) {
		
		/*
		System.out.println("Printing local variable from method local_variable() ");
		System.out.println("String i = " + i); //error occurred 
		*/
		
		   //create object
		    FirstClass obj = new FirstClass();
		    //runs the method
		    obj.local_variable();
		    
		    //instance variable will print 
		    System.out.println("Instance variable: " + obj.j);
		    System.out.println();
		    
		    //static variable will print
		    System.out.println("Static variable: " + FirstClass.k);

		
		    final int age = 25;
		    System.out.println(age);
		  
		    
		    
	}

}

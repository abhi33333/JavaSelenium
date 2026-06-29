package firstpkg;

public class SecondClass {

	public static void main(String[] args) {
		
		/* FirstClass members from SecondClass can be accessed depending on their type.
		String j
		static String k
		public void local_variable()
		*/
		
		  // create object of FirstClass
        FirstClass obj = new FirstClass();

        // verify instance variable
        System.out.println("Instance variable: " + obj.j);

        // verify static variable
        System.out.println("Static variable:" + FirstClass.k);

        // call method that contains local variables
        System.out.println("Calling local_variable() method:");
        obj.local_variable();
        System.out.println();
        
        
     // Implicit casting (small(int) → large(double))
        int aa = 100;
        double bb = aa;

        System.out.println("Implicit Casting:");
        System.out.println("int value = " + aa);
        System.out.println("double value after casting = " + bb);
        System.out.println();

        
        // Explicit casting (large(double) → small(int))
        double xx = 25.75;
        int yy = (int) xx;

        System.out.println("Explicit Casting:");
        System.out.println("double value = " + xx);
        System.out.println("int value after casting = " + yy);

	}

}

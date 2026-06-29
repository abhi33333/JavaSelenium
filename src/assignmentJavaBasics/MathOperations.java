package assignmentJavaBasics;

public class MathOperations {
	//square(int num) → returns square of a number
	public int square(int num) {
		
	      return num * num;
		
	}
	
	//cube(int num) → returns cube of a number
    public int cube(int num) {
			
		      return num * num * num;
			
		}
    
    // Method to check if number is even
    public boolean isEven(int num) {

        return num % 2 == 0;
    
    }

	public static void main(String[] args) {
		
		MathOperations obj = new MathOperations();
		
		//print square
	    int result = obj.square(5);
        System.out.println("Square is: " + result);
        
        //print cube
        int result1 = obj.cube(3);
        System.out.println("Cube is: " + result1);
        
        //print even or odd
        boolean result3 = obj.isEven(4);
        boolean result4 = obj.isEven(7);
        System.out.println("Is 4 even? " + result3);
        System.out.println("Is 7 even? " + result4);

	}

}

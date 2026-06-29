package assignmentJavaBasics;

public class Calculator {

	 // Addition method
    public int add(int a, int b) {

        return a + b;
    }

    // Subtraction method
    public int subtract(int a, int b) {

        return a - b;
    }

    // Multiplication method
    public int multiply(int a, int b) {

        return a * b;
    }

    // Division method
    public double divide(int a, int b) {

        return (double) a / b;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Input values
        int num1 = 20;
        int num2 = 5;

        // Calling methods
        int additionResult = calc.add(num1, num2);
        int subtractionResult = calc.subtract(num1, num2);
        int multiplicationResult = calc.multiply(num1, num2);
        double divisionResult = calc.divide(num1, num2);

        // Printing results
        System.out.println("Addition of " + num1 + " and " + num2 + " is "+ additionResult);
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is "+  subtractionResult);
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is "+  + multiplicationResult);
        System.out.println("Division of  "  + num1 + " and " + num2 + " is "+  + divisionResult);
    }
}
package firstpkg;

import assignmentJavaBasics.Students;

public class MathsOp {
	
	int x;
	public void addition(int a, int b) {
		int c = a+b;
		System.out.println("Addition of two numbers " + c);
	}
	
	public void substraction(int a, int b) {
		int c = a-b;
		System.out.println("Substraction of two numbers " + c);
	}
	
	
	public int abcAdd (int a, int b) {
		int d = a +b ;
		int c = a + d;
		return c;
	}
	
	public MathsOp(int a){
	
		 x = a +1 ; 
	}
	
	public int getX() {
		return x;
		
	}

	public static void main(String[] args) {
		
      MathsOp obj = new MathsOp(600);
 
      System.out.println(obj.x);
      
      obj.addition(5,6);
      obj.substraction(12,6);
      int result = obj.abcAdd(2, 3);
      System.out.println("result is " + result);
      //System.out.println("result is " + obj.abcAdd(2, 3));
      System.out.println();
      
      MathsOp obj1 = new MathsOp(300);
      System.out.println("value of constructor is " + obj1.getX());
      System.out.println();
      
      FirstClass obj3 =new FirstClass();
      obj3.local_variable();
      System.out.println();
      
      Students obj4 = new Students("Naushad", 45690);
      obj4.displayInfo();

	}

}

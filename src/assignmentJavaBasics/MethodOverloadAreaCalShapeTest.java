package assignmentJavaBasics;


public class MethodOverloadAreaCalShapeTest {
	
	public static void main(String[] args) {
	
	     MethodOverloadAreaCalShape s = new MethodOverloadAreaCalShape();

         double circleArea = s.area(3.1);

         int rectangleArea = s.area(10, 20);
    

       System.out.println("Area of Circle: " + circleArea);
       System.out.println("Area of Rectangle: " + rectangleArea);

}
}
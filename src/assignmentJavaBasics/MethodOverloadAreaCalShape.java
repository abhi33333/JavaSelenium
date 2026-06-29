package assignmentJavaBasics;

/*  Method Overloading Exercises
Area Calculator
1. Create a class Shape.
       Overload area() method to calculate:
       Area of a circle (takes radius)
       Area of a rectangle (takes length and breadth)
* */


class MethodOverloadAreaCalShape {
	
	// Area of circle 
    double area(double radius) {

        return 3.14 * radius * radius;
    }

    // Area of rectangle
    int area(int length, int breadth) {

        return length * breadth;
    }

}

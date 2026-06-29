package constructorInheritance;
/*Constructor Inheritance
1. Create a parent class with a constructor that prints "Parent constructor".
2. Create a child class with its own constructor that prints "Child constructor".
3. Create object of child class and observe constructor execution order. */

class ParentInstructor {
    ParentInstructor() {
        System.out.println("Parent constructor");
    }
}
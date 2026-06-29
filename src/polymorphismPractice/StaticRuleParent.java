package polymorphismPractice;

/*Static Method Rule: static methods are hidden, not overridden.
  1. Create parent class Parent with static method:
            display()
  2. Create child class Child with same static method.
            Call using class name:
                         Parent.display();
                          Child.display();
*/

class StaticRuleParent {
	
	static void display() {
        System.out.println("Parent static method");
    }

}

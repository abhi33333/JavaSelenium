package polymorphismPractice;
/*Array Polymorphism: one parent type can hold many child objects.
  Using the same Animal example, create an array:
  Animal[] animals = {
    new Dog(),
    new Cat(),
    new Cow()
   };
  Use a loop and call:
  animal.makeSound(); 
  */

class ArrayPolyAnimal {
	 void makeSound() {
	        System.out.println("Animal makes sound");
	    }

}

package abstraction;

/*Concept: Abstract class can contain:
                                   abstract methods
                                   normal methods
 Problem :Create abstract class Animal.
          Add abstract method sound() and normal method sleep().
 * */

public abstract class abstractClassAnimal {
	
	abstract void sound();
	abstract void eat();
	
	void sleep() {
		
		System.out.println("Animal sleeps");
	}
	

}

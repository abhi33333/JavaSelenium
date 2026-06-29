package polymorphismPractice;
/* Upcasting: child object stored in parent reference. 
   1. Create parent class UpcastingPracticeAnimal. 
   2. Create child classes Dog, Cat, and Cow. 
   Each child overrides makeSound().
 */

class UpcastingPracticeAnimal {
	
	void makeSound() {
        System.out.println("Animal makes sound");
    }
}
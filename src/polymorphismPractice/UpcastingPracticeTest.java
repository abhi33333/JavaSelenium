package polymorphismPractice;

public class UpcastingPracticeTest {
	
	public static void main(String[] args) {
	 
	UpcastingPracticeAnimal a;

     a = new UpcastingPracticeCat();
     a.makeSound();

     a = new UpcastingPracticeCow();
     a.makeSound();
     
     a =  new UpcastingPracticeDog();
     a.makeSound();

	}
}

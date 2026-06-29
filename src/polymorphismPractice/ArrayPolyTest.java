package polymorphismPractice;

public class ArrayPolyTest {
	
	public static void main(String[] args) {

        ArrayPolyAnimal[] animals = {
                new ArrayPolyDog(),
                new ArrayPolyCat(),
                new ArrayPolyCow()
        };

        for (ArrayPolyAnimal animal : animals) {
            animal.makeSound();
        }
    }

}

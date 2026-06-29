package polymorphismPractice;

public class UpcastingPracticeDog extends UpcastingPracticeAnimal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

}


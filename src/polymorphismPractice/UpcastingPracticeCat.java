package polymorphismPractice;

public class UpcastingPracticeCat extends UpcastingPracticeAnimal {

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }

}

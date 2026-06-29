package polymorphismPractice;

public class UpcastingPracticeCow extends UpcastingPracticeAnimal {

    @Override
    void makeSound() {
        System.out.println("Cow moos");
    }

}


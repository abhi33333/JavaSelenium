package multiInheritance;

public class Test {

    public static void main(String[] args) {

        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
        System.out.println();
        
        Dog d = new Dog();
        d.eat();
        d.bark();
        System.out.println();
        
        Animal a = new Animal();
        a.eat();
    }
}
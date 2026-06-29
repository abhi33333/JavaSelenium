package polymorphismPractice;

public class overloadCalTest {

	public static void main(String[] args) {

        overloadCalculator calc = new overloadCalculator();

        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));
        System.out.println(calc.add(5.5, 4.5));
    }

}

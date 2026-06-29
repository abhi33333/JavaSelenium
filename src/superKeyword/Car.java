package superKeyword;

class Car extends Vehicle {

    String brand = "Honda";

    void display() {

        System.out.println(brand);
        System.out.println(super.brand);
    }
}
package assignmentJavaBasics;

public class Car {

	//attributes
	 String brand;
	 String model;
	 int year;
	
	//Constructor
	 public Car(String brand, String model, int year) {
		 
		 this.brand = brand;
		 this.model = model;
		 this.year = year;
	 }
	 
	 // Method to print car details
	 public void displayCarDetails() {
		 
		    System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
		 
	 }
	 
	 
	
	    public static void main(String[] args) {

	        // Creating objects
	        Car car1 = new Car("Toyota", "Camry", 2022);
	        Car car2 = new Car("Honda", "Civic", 2021);

	        // Printing details
	        car1.displayCarDetails();
	        System.out.println();
	        car2.displayCarDetails();
	    }
	}
	
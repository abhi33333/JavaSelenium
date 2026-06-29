package assignmentJavaBasics;

public class Students {

	// Attributes
    String name;
    int registrationNumber;

    // Constructor
    public Students(String name, int registrationNumber) {

        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    // Method to display student information
    public void displayInfo() {

        System.out.println("Student Name: " + name);
        System.out.println("Registration Number: " + registrationNumber);
    }

    public static void main(String[] args) {

        // Creating objects
        Students student1 = new Students("Amber", 101);
        Students student2 = new Students("Raol", 102);

        // Calling methods
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
    }
}

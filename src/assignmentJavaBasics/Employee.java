package assignmentJavaBasics;

public class Employee {
	
	// Attributes
    String name;
    double salary;

    // Parameterized constructor
    public Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }

    // Method to print employee details
    public void displayEmployeeDetails() {

        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {

        // Creating object
        Employee emp1 = new Employee("John", 75000);

        // Calling method
        emp1.displayEmployeeDetails();
    }
}
package assignmentJavaBasics;
/*Encapsulation Exercises: Employee Salary
  Private fields: name, employeeId, salary
  Provide getter/setter for all fields and access them outside this class.

 * */

class EncapsulationEmployee {
	
	private String name;
	private int employeeID;
	private double salary;
	
	// Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

	//Setter for employeeID
    public void setEmpId(int employeeID) {
    	this.employeeID = employeeID;	
    }
    
    //Getter for employeeID
    public int getEmpId() {
    	return employeeID;
    }
    
    //setter for salary
    public void setSalary(double salary) {
    	this.salary= salary;
    	
    }
    
    //getter for salary
    public double getSalary() {
    	return salary;
    }
	

}

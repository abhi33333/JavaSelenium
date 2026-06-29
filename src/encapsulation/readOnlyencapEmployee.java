package encapsulation;
/*Concept: Data can only be read, not modified.
   Problem: Create class Employee.
            Salary should only be readable.
 * */

class readOnlyencapEmployee {
	
	private int salary = 50000;

    public int getSalary() {

        return salary;
    }
}



package assignmentJavaBasics;

public class EncapsulationEmployeeTest {

	public static void main(String[] args) {
		EncapsulationEmployee emp = new EncapsulationEmployee();
		
		// Setting values
        emp.setName("Asupoochuchu");
        emp.setEmpId(10156);
        emp.setSalary(105000);

        // Getting values
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Salary: " + emp.getSalary());
		

	}

}

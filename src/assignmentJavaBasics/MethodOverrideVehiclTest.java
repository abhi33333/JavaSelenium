package assignmentJavaBasics;

public class MethodOverrideVehiclTest {

	public static void main(String[] args) {
		
		MethodOverrideVehicle v;

	        v = new MethodOverrideVehiclCar();
	        v.speed();

	        v = new MethodOverrideVehiclBike();
	        v.speed();

	        v = new MethodOverrideVehiclTruck();
	        v.speed();
		
		
		
	}

}

package day1_practiceExercise.question6;

public class TestVehicle {

	public static void main(String[] args) {
		
		//Car details
		Vehicle car = new Car();
		car.setManufacturer("hyndai");
		car.setModel("venue");
		car.setYear(2021);
		Car c = (Car)car; // Downcasting to aquire Car-class method
		c.setSeatingCapacity(4);
		car.displayDetails();
		
		//Motorcycle details
		Vehicle motorcycle = new MotorCycle();
		motorcycle.setManufacturer("bajaj");
		motorcycle.setModel("ns200");
		motorcycle.setYear(2023);
		MotorCycle m = (MotorCycle) motorcycle; // Downcasting to aquire Motorcycle-class method
		m.setEngineCapacity(200);
		motorcycle.displayDetails();
		
		//Truck details
		Vehicle truck = new Truck();
		truck.setManufacturer("TATA");
		truck.setModel("truck1000");
		truck.setYear(2018);
		Truck t = (Truck) truck;   // Downcasting to aquire Truck-class method
		t.setCargoCapacity(100000);
		t.displayDetails();

	} 

}

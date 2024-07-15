package day1_practiceExercise.question6;

public class Vehicle {

	String manufacturer;
	String model;
	int year;

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void displayDetails() {
		System.out.println("Manufacturer: " + this.manufacturer);
		System.out.println("model: " + this.model);
		System.out.println("year: " + this.year);
	}

}

class Car extends Vehicle {

	int seatingCapacity;

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
 
	@Override 
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Seating Capacity: "+this.seatingCapacity+"\n"); 
	}

} 

class MotorCycle extends Vehicle {
	
	int engineCapacity;

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Engine Capoacity: "+this.engineCapacity+"\n"); 
	}
	
}

class Truck extends Vehicle {
	
	int cargoCapacity;

	public int getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Cargo Capacity: "+this.cargoCapacity+"\n"); 
	}

	
}

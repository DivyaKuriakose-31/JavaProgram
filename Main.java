package test;

class Vehicle{
	String brand;
	String model;
	
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	public void displayInfo() {
		System.out.println("Brand name: "+brand);
		System.out.println("Model: "+model);
	}
}
class Car extends Vehicle{
	String fuelType;
	Car(String brand,String model,String fuelType){
		super(brand,model);
		this.fuelType=fuelType;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Fuel Type: "+fuelType);
	}
}
class ElectricCar extends Car{
	double batteryCapacity;
	ElectricCar(String brand,String model,String fuelType,double batteryCapacity){
		super(brand,model,fuelType);
		this.batteryCapacity=batteryCapacity;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Battery Capacity: "+batteryCapacity);
	}
}
public class Main {
   public static void main(String[] args) {
	   ElectricCar ecar=new ElectricCar("Tesla","Model S","Electric",100);
       ecar.displayInfo();
   }
}

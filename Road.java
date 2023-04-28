package com.ericsson.java.training;

class vehicle
{
	
	String makeName;
	String modelName;
	String type;
	String color;
	vehicle()
	{
		makeName = "unknown";
		modelName = "unknown";
		type = "unknown";
		color = "unknown";
	}
	
	public void printVehicleName()
	{
		System.out.println("======================================");
		System.out.println("make: "+makeName+"\nmodel: "+modelName);
		System.out.println("type: "+type+"\ncolor: "+color);
		//System.out.println("Vehicle ");
	}
	
}

class truck extends vehicle
{
	int numOfWheels;
	int totalWeight;
	truck()
	{
		makeName = "Tata";
		modelName = "407";
		type = "truck";
		color = "Yellow";
		numOfWheels = 4;
		totalWeight = 10000;
	}
	
	public void printTruckDetails()
	{
		printVehicleName();
		System.out.println("Num Of Wheels: "+numOfWheels);
		System.out.println("Total weight: "+totalWeight);
	}
}
class car extends vehicle
{
	int numOfWheels;
	int totalWeight;
	car()
	{
		makeName = "Honda";
		modelName = "Amaze";
		type = "car";
		color = "Maroon";
		numOfWheels = 4;
		totalWeight = 1000;
	}
	
	public void printCarDetails()
	{
		printVehicleName();
		System.out.println("Num Of Wheels: "+numOfWheels);
		System.out.println("Total weight: "+totalWeight);
	}
}

class bus extends vehicle
{
	int numOfWheels;
	int totalWeight;
	bus()
	{
		makeName = "Leyland";
		modelName = "MultiAxle";
		type = "Bus";
		color = "Blue";
		numOfWheels = 4;
		totalWeight = 6000;
	}
	
	public void printBusDetails()
	{
		printVehicleName();
		System.out.println("Num Of Wheels: "+numOfWheels);
		System.out.println("Total weight: "+totalWeight);
	}
}

public class Road {

	public static void main(String[] args) {
		truck mytruck = new truck();
		mytruck.printTruckDetails();
		bus mybus = new bus();
		mybus.printBusDetails();
		car mycar = new car();
		mycar.printCarDetails();
	}

}

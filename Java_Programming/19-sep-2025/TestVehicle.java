
class Vehicle
{
	int speed;
	int fuel;
	int wheels;
	
	Vehicle() {
		super();
		this.speed= 20;
		this.fuel= 2;
		this.wheels=2;
	}

	Vehicle(int speed, int fuel, int wheels) {
		super();
		this.speed = speed;
		this.fuel = fuel;
		this.wheels = wheels;
	}

	int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	int getFuel() {
		return fuel;
	}

	void setFuel(int fuel) {
		this.fuel = fuel;
	}

	int getWheels() {
		return wheels;
	}

	void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	void display() {
		System.out.println("Speed of Vehicle: "+this.speed);
		System.out.println("Fuel type: "+this.fuel);
		System.out.println("No of Vehicles: "+ this.wheels);
		
	}
	
	void Brake() {
		System.out.println("Vehicle Brakes Applied..");
	}
	
}

class Car extends Vehicle
{
	int doors;
	
	Car(){
		super();
		this.doors= 4;
	}
	
	Car(int speed, int fuel, int wheels, int doors){
		super(speed, fuel, wheels);
		this.doors= doors;
	}

	int getDoors() {
		return doors;
	}

	void setDoors(int doors) {
		this.doors = doors;
	}
	
	void display() {
		super.display();
		System.out.println("NO of Doors: "+ this.doors);
	}
	
	void Brake() {
		System.out.println("Car Brakes Applied..");
	}
}


class Bus extends Vehicle
{
	int capacity;
	String Driver_name;
	
	Bus() {
		super();
		this.capacity= 80;
		this.Driver_name= "Ramesh";
	}

	Bus(int speed, int fuel, int wheels,int capacity, String driver_name) {
		super(speed, fuel, wheels);
		this.capacity = capacity;
		Driver_name = driver_name;
	}

	int getCapacity() {
		return capacity;
	}

	void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	String getDriver_name() {
		return Driver_name;
	}

	void setDriver_name(String driver_name) {
		Driver_name = driver_name;
	}
	
	void display() {
		super.display();
		System.out.println("Seat Capacity: "+ this.capacity);
		System.out.println("Driver Name: "+ this.Driver_name);
	}
	
	void Brake() {
		System.out.println("Bus Brakes Applied..");
	}
	
}

class Bicycle extends Vehicle
{
	String breakType;
	String color;
	
	Bicycle() {
		super();
		this.breakType= "bell";
		this.color= "black";
	}

	Bicycle(int speed, int fuel, int wheels, String breakType, String color) {
		super(speed, fuel, wheels);
		this.breakType = breakType;
		this.color = color;
	}

	String getBreakType() {
		return breakType;
	}

	void setBreakType(String breakType) {
		this.breakType = breakType;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}
	
	void display() {
		super.display();
		System.out.println("Break Type: "+ this.breakType);
		System.out.println("Color: "+ this.color);
	}
	
	void Brake() {
		System.out.println("Bicycle Brakes Applied..");
	}
	
}

class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle V1= new Vehicle(50, 5, 6);
		V1.display();
		V1.Brake();
		
		System.out.println();
		
		V1 = new Car(50, 5, 6, 4);             // Upcasting
		V1.display();                  
		V1.Brake();
		
		System.out.println();
		
		V1 = new Bus(50, 5, 6, 60, "Suresh");          // Upcasting
		V1.display();
		V1.Brake();
		
		System.out.println();
		
         V1 = new Bicycle (50, 5, 2, "Disc", "Pink");     // Upcasting
         V1.display();
         V1.Brake();
		

	}

}


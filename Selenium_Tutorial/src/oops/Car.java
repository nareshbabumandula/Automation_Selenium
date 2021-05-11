package oops;

public abstract class Car {
	
	// Concrete java method
	void Speed() {
		// Method body or implementation
		System.out.println("Speed is 100 KMPH");
	}
	
	// Unimplemented body or abstract method or bodyless method or method without body
	abstract void Airbags();
	
	abstract void AutomaticGearSystem();
	
	abstract void ABS();
	
	static void Model() {
		System.out.println("Ford Figo 2021 VXI");
	}
	
	public Car() {
		System.out.println("Car Constructor");
	}

	public static void main(String[] args) {
		//Car c = new Car();
		Model();
	}

}

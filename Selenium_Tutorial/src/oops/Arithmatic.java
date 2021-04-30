package oops;

public class Arithmatic {

	// State/Characteristics/Attributes/Data Members
	int a=10;
	int b=20;

	// Behavior or action
	// addition : Method name
	void addition() {
		// Method body or implementation
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}

	void subtraction() {
		int c=a-b;
		System.out.println("subtraction of a and b is : " + c);
	}

	void multiplication() {
		int c=a*b;
		System.out.println("Multiplication of a and b is : " + c);
	}
	
	void division() {
		int c=b/a;
		System.out.println("Division of a and b is : " + c);
	}
	
	void modulus() {
		int c=b%a;
		System.out.println("Modulus of a and b is : " + c);
	}

	public static void main(String[] args) {
		
		// Create an object reference for the class
		// Syntax: Classname objRefName = new Constructor();
		Arithmatic arth = new Arithmatic();
		arth.addition();
		arth.subtraction();
		arth.multiplication();
		arth.division();
		arth.modulus();
		System.out.println(arth.a);
		System.out.println(arth.b);
		

	}

}

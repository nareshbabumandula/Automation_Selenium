package basics;

public class DataTypes {

	public static <Java> void main(String[] args) {
		
		/*
		 * Java language is a case senstitive and high level language Primitive
		 * datatypes byte -> short -> int -> long -> float -> double -> char -> boolean
		 * Memory allocation for the primitive data types if fixed irrespective of the
		 * operating system
		 * Dynamic Programming Language : If any programming language allows memory allocation for the
		 * primitive data types at RUNTIME then that programming language is called as Dynamic language
		 * Type checking happens at compile time, Java is statically-typed, so it expects its variables to be declared before they can be assigned
		 * values.
		 */
		
		/* Steps to Run the Java application 
		 * 1. Click on Run button in toolbar
		 * 2. Right Click on Code editor -> Run As -> Java Application
		 * 3. Right Click on File name.java -> Run As -> Java Application
		 * 4. Press Ctrl + F11
		 * */
				
		byte a=122; // 1 byte = 8 bits
		short b=4544; // 2 bytes = 16 bits
		int c=23425; // 4 bytes
		long d = 2453456; // 8 bytes
		float e = 24.4f; // 4 bytes
		double f = 2345.45756; // 8 bytes
		char g = 'j'; // 2 bytes
		boolean h = true; // 1 bit
		
		//sysout + ctrl + spacebar
		System.out.println("Byte value of a is : " + a);
		System.out.println("Short value of b is : " + b);
		System.out.println("Int value of c is : " + c);
		System.out.println("Long value of d is : " + d);
		System.out.println("Float value of e is : " + e);
		System.out.println("Double value of f is : " + f);
		System.out.println("Char value of g is : " + g);
		System.out.println("Boolean value of h is : " + h);
		

	}

}

package casting.demo;

class Parent {
	
	void Demo() {
		System.out.println("Demo method from Parent class");
	}

}

class Child extends Parent{
	void Demo() {
		System.out.println("Demo method from Child class");
	}
}


public class UpCastingTest{
	/* In upcasting the child object is typecasted to a parent object
	 * We can easily access the variables and methods of parent to the child class
	 * */
	
	public static void main(String args[]) {
		
		Parent p = new Child(); // Upcasting
		p.Demo();
		
	}
	
}


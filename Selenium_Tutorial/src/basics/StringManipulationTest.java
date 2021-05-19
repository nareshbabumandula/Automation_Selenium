package basics;

public class StringManipulationTest {
	
	String sText1 = "hello";
	String sText2 = "WORLD";
	String sText3 = "hello welcome to core java training";
	String sText4 = "The Java Tutorials have been written for JDK 8. Examples and practices "
			+ "described in this page don't take advantage of improvements introduced in "
			+ "later releases and might use technology no longer available";
	String sText5 = "       welcome to selenium training                    ";
	
	public void stringMethods() {
		
		System.out.println(sText1.toUpperCase());
		System.out.println(sText2.toLowerCase());
		System.out.println(sText3.length());
		System.out.println(sText4.charAt(0));
		System.out.println(sText5.trim());
		System.out.println(sText1.indexOf('o'));
		System.out.println(sText3.lastIndexOf('o'));
		System.out.println(sText3.replaceAll("training", "online training"));	
		System.out.println(sText4.contains("technology"));
		System.out.println(sText1.equals("hello"));
		System.out.println(sText2.equalsIgnoreCase("world"));
		System.out.println(sText3.startsWith("hello"));
		System.out.println(sText4.endsWith("available"));
		System.out.println(sText1.hashCode());
	}

	public static void main(String[] args) {
		StringManipulationTest sm = new StringManipulationTest();
		sm.stringMethods();

	}

}

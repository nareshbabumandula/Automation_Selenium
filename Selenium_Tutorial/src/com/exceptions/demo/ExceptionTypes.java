package com.exceptions.demo;

public class ExceptionTypes {
	
	public void ExceptionsExample() {
		
		try {
			//String sText = null;
			//System.out.println(sText.length()); // NullPointerException
			
			//String str = "hello";
			//int res = Integer.parseInt(str); // NumberFormatException
			//System.out.println(res); 
			
			int arr[] = new int[4];
			arr[0]=10;
			arr[1]=20;
			arr[2]=30;
			arr[3]=40;
			//arr[4]=50;  // ArrayIndexOutOfBoundsException
			System.out.println(arr[3]);
			
			int a=10;
			int b=0;
			int c= a/b;
			System.out.println("Division of a and b is : "+c);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		// rest of the code
		System.out.println("Remaining code..!");
	}

	public static void main(String[] args) {
		
		ExceptionTypes et = new ExceptionTypes();
		et.ExceptionsExample();
		
	}

}

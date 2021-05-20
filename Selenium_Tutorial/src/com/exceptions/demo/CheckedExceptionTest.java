package com.exceptions.demo;

import java.io.File;

public class CheckedExceptionTest {
	
	public void checkedExceptionExample() {
		System.out.println(System.getProperty("user.dir"));
		File file = new File(".\\Files\\Test Data.txt");
		System.out.println(file.exists());
		
	}

	public static void main(String[] args) {
		
		CheckedExceptionTest cet = new CheckedExceptionTest();
		cet.checkedExceptionExample();
	}

}

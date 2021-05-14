package control.statements;

import java.util.Scanner;

public class SwitchTest {
	
	public void SwitchExample() {
		System.out.println("Enter any day..!");
		Scanner sc = new Scanner(System.in);
		String strDay = sc.next();
		switch (strDay) {
		case "sun": case "sund":
			System.out.println("Sunday");
			break;
		case "mon":
			System.out.println("Monday");
			break;
		case "tue":
			System.out.println("Tuesday");
			break;
		case "wed":
			System.out.println("Wednesday");
			break;
		case "thu":
			System.out.println("Thursday");
			break;
		case "fri":
			System.out.println("Friday");
			break;
		case "sat":
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day..!");
			break;
		}
	}

	public static void main(String[] args) {
		SwitchTest st = new SwitchTest();
		st.SwitchExample();

	}

}

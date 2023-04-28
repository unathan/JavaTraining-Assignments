package com.ericsson.java.training;

import java.util.Scanner;

public class DisplayWeekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for checking WeekDay");
		int num = scan.nextInt();
		switch(num)
		{
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednessday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
					System.out.println("Invalid Input");
		}
		
		scan.close();
	}

}

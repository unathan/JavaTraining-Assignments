package com.ericsson.java.training;

import java.util.Scanner;

public class Scanner_Ex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for checking sign");
		int num = scan.nextInt();
		if (num < 0)
		{
			System.out.println("Number is Negative");
		}
		
		else
		{
			System.out.println("Number is Positive");
		}
		scan.close();
		
	}

}


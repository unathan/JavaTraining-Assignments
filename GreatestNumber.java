package com.ericsson.java.training;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		int num[] = {0,0,0}, ind = 0, gTst = 0;
		Scanner scan = new Scanner(System.in);
		while (ind < 3)
		{
			System.out.println("Enter a number");
			num[ind] = scan.nextInt();
			if (gTst < num[ind])
			{
				gTst = num[ind];
			}
			
			ind++;
		}
		System.out.println("Greatest Number: "+ gTst);
		
		scan.close();
	}
}

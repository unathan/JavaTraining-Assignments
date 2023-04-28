package com.ericsson.java.training;

import java.util.Scanner;

public class SumAndAvgOf5Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 0, 0, 0, 0, 0 }, ind = 0, sum = 0;
		float avg = 0;
		Scanner scan = new Scanner(System.in);
		while (ind < 5) {
			System.out.println("Enter a number");
			num[ind] = scan.nextInt();
			sum += num[ind];
			ind++;
		}
		System.out.println("sum of Numbers: " + sum);
		avg = sum / ind;
		System.out.println("avg of Numbers: " + avg);

		scan.close();
	}

}

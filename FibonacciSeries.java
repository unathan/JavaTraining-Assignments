package com.ericsson.java.training;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		short result = 1, lastResult= 0, end = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the ending number for fibonacci series");
		end = scan.nextShort();
		System.out.println(lastResult+"\n"+result);
		while(result <= end)
		{
			short tmp = result;
			result += lastResult;
			lastResult = tmp;
			System.out.println(result+" ");
			
		}
		scan.close();
	}

}

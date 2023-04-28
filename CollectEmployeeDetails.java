package com.ericsson.java.training;

import java.util.Scanner;

public class CollectEmployeeDetails {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Id\n");
		int empId = scan.nextInt();
		
		System.out.println("Enter Employee name\n");
		String empName = scan.next();
		
		System.out.println("Enter Employee Salary\n");
		float empSal = scan.nextFloat();
		
		System.out.println("Enter Employee Address\n");
		String empAddr = scan.next();
		
		System.out.println("Enter Employee contact\n");
		long empContact = scan.nextLong();
		
		System.out.println("Enter Employee Gender\n");
		char empGender = scan.next().charAt(0);
		
		System.out.println("Employee Id:"+ empId);
		System.out.println("Employee name:"+ empName);
		System.out.println("Employee Salary:"+ empSal);
		System.out.println("Employee Address:"+ empAddr);
		System.out.println("Employee Contact:"+ empContact);
		System.out.println("Employee Gender:"+ empGender);
		scan.close();
	}
	

}

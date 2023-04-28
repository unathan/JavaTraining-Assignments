package com.ericsson.java.training;

public class StringEndWithMatch {

	public static void main(String[] args) {
		String str = "MadhyaPradesh";
		
		boolean match = str.endsWith("Pradesh");
		System.out.println(match);
		
		match = str.endsWith("Nadu");
		System.out.println(match);
	}

}

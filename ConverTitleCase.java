package com.ericsson.java.training;

public class ConverTitleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1 = new StringBuffer("java standard edition");
		str1.setCharAt(0, Character.toUpperCase(str1.charAt(0)));
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == ' ') {
								
				str1.setCharAt(i+1, Character.toUpperCase(str1.charAt(i+1)));
				
			}
		}
		System.out.println(str1);


	}

}

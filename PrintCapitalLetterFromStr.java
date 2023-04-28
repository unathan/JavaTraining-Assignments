package com.ericsson.java.training;

public class PrintCapitalLetterFromStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MadhyaPradesh";
		int i = 0;
		while(i < str.length())
		{
			if (true == Character.isUpperCase(str.charAt(i)))
			{
				System.out.println(str.charAt(i));
			}
			i++;
		}
	}

}

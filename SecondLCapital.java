package com.ericsson.java.training;

public class SecondLCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("bvrit college");
		int i = 0, lCount = 0;
		while(i < str.length())
		{
			
			if ('l' == str.charAt(i))
			{
				//System.out.println(str.charAt(i));
				lCount++;
			}
			
			if (('l' == str.charAt(i)) && (lCount == 2))
			{
				
				str.setCharAt(i, 'L');
			}
			
			i++;
		}
		System.out.println(str);
	}

}

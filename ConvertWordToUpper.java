package com.ericsson.java.training;

public class ConvertWordToUpper {

	public static void main(String[] args) {

		String str = "b v raju college";
		String[] strs1 = str.split(" ");
		StringBuffer strRes = new StringBuffer();
		int i = 0;
		while (i < strs1.length) {
			if (i == 2) {
				System.out.println(strs1.length);
				String strCap = strs1[2].toUpperCase();
				strRes.append(strCap);
				strRes.append(" ");
				i++;
			} else {
				strRes.append(strs1[i++]);
				strRes.append(" ");
			}
			System.out.println(strRes);
		}
	}
}

package com.ericsson.java.training;

public class SubStrMatch {

	public static void main(String[] args) {
		String str = "TamilNadu";
		CharSequence cs = "Nadu";
		boolean match = str.contains(cs);
		System.out.println(match);
	}

}

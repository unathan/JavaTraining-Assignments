package com.ericsson.java.training;

public class NumOfWordsInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Standard Edition";
		String[] words = str.split(" ");
		int wordCount = words.length;
		System.out.println(wordCount);
	}
}

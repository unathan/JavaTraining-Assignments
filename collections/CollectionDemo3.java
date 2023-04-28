package com.ericsson.java.training.collections;

import java.util.HashMap;

/*Create a program to get the HashMap from the given input string array 
 where the key for the HashMap is first three letters of array element in Upper Case 
 and the value of HashMap is the element itself
 
Input:{“goa”,”kerala”,”gujarat”} [string array]
Output:{{GOA,goa},{KER,kerala},{GUJ,Gujarat}} [hashmap]
*/

public class CollectionDemo3 {

	public static HashMap<String, String> getEntries(String array[]) {
		HashMap<String, String> hM = new HashMap<String, String>();
		int i = 0;
		while(i < array.length)
		{
			String key = new String(array[i].substring(0, 3));
			hM.put(key.toUpperCase(), array[i]);
			i++;
		}
		return hM;
	}

	public static void main(String[] args) {

		String array[] = { "goa", "kerala", "gujarat" };
		System.out.println(getEntries(array));
		//getEntries(array);
	}
}

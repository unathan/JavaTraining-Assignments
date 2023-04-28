package com.ericsson.java.training.map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> mytm = new TreeMap<Integer, String>();
		mytm.put(100, "E120");
		mytm.put(101, "E121");
		mytm.put(102, "E122");
		mytm.put(103, "E123");
		System.out.println(mytm);
		TreeMap<Integer, String> mytm1 = new TreeMap<Integer, String>();
		mytm1.put(105, "E126");
		mytm1.put(110, "E121");
		mytm1.putAll(mytm);
		System.out.println(mytm1);
		//mytm1.forEach(mytm1.entrySet(););
		Set<Entry<Integer, String>> mapset = mytm1.entrySet();
		Iterator<Entry<Integer, String>> it1 = mapset.iterator();
		System.out.println("=====================================");
		while(it1.hasNext())
		{
			Entry<Integer, String> myen = it1.next();
			System.out.println(myen.getKey()+ "" + myen.getValue());
		}
	}
}

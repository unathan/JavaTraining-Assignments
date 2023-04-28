package com.ericsson.java.training.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo1 {

	public static List<Integer> getZigZagList(List<Integer> l1, List<Integer> l2) {
		int totalLength = l1.size() + l2.size();
		ArrayList<Integer> lR  = new ArrayList<Integer>();
		
		int cL1 = 0, cL2 = 1;
		
		for (int i =0; i < totalLength;i++)
		{
			if (0 == i%2)
			{
				if (cL1 < l1.size())
				{
					lR.add(l1.get(cL1));
					cL1 += 2;
				}
			}
			else
			{
				if (cL2 < l2.size())
				{
					lR.add(l2.get(cL2));
					cL2 += 2;
				}
			}
    	}
		
		return lR;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		List<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.add(500);

		System.out.println(getZigZagList(list1, list2));
		//expected output : [10,200,30,400,50]
		//get even index elements from list 1, odd index elements from list 2 
		//store all in to another list and return   

	}

}

package com.ericsson.java.training.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.TreeSet;


public class CollectionDemo2 {

	public static int getMaxNumber(List<Integer> l1) {
		//get maximum number from the list
		Integer maxNum = 0;
		ListIterator<Integer> lItr = l1.listIterator();
		while(lItr.hasNext())
		{
			Integer tmp = lItr.next();
			if (maxNum < tmp)
			{
				maxNum = tmp;
			}
		}
		return maxNum;
	}

	public static List<Integer> getReversedList(List<Integer> l1) {
		//reverse the list and return
		List<Integer> rLst = new ArrayList<Integer>();
		Stack<Integer> ls = new Stack<Integer>();
		ListIterator<Integer> lItr = l1.listIterator();
		//ls.addAll(l1);
		
		while(lItr.hasNext())
		{
			ls.push(lItr.next());
		}
		
		while(!ls.isEmpty())
		{
			rLst.add(ls.pop());
		}
		return rLst;
	}
	
	public static List<Integer> getOrderedList(List<Integer> l1) {
		// return the ordered list [ascending order]
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.addAll(l1);
		List<Integer> rLst = new ArrayList<Integer>();
		rLst.addAll(tSet);
		return rLst;
	}
	
	public static Integer getExactMidNumber(List<Integer> l1) {
		// return the mid number after sorting
		// NOTE : if the list size is odd, return the exact mid,
		//ex : after sorting, the list will be [32,48,145,202,598], the exact mid number is 145
		 
		//if the list size is even, return the max number from the mid numbers 
		//EX: [10,14,54,76,234,123] => mids are [54,76] => as 76 is greater return 76
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.addAll(l1);
		List<Integer> rLst = new ArrayList<Integer>();
		rLst.addAll(tSet);
		Integer rMid = rLst.get(rLst.size()/2); 
		//System.out.println(tSet);
		return rMid;
	}

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(145);
		list1.add(202);
		list1.add(32);
		list1.add(48);
		list1.add(598);

		System.out.println(getMaxNumber(list1)); 
		System.out.println(getReversedList(list1));
		System.out.println(getOrderedList(list1));
		System.out.println(getExactMidNumber(list1));
		
		List<Integer> list2 = new ArrayList<>();
		//EX: [10,14,54,76,234,123] => mids are [54,76] => as 76 is greater return 76
		list2.add(10);
		list2.add(14);
		list2.add(54);
		list2.add(76);
		list2.add(234);
		list2.add(123);
		System.out.println(getOrderedList(list2));
		System.out.println(getExactMidNumber(list2));
	}
}


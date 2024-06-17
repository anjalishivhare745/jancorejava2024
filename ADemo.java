package com.as.Collection;

import java.util.ArrayList;

public class ADemo {

	public static void main(String[] args) {

		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		arraylist.add(40);
		arraylist.add(50);
		arraylist.add(null);
		
		System.out.println(arraylist);
		System.out.println(arraylist.size());
		
	}

}

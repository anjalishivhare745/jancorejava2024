package com.as.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		//Creating object of Arraylist
		ArrayList<Integer>arraylist= new ArrayList<Integer>();
		//preparing list of 0 to 20 elements
		
		for(int i= 0; i<=20; i++) {
			arraylist.add(i);
		}
		System.out.println(arraylist);
		//getting an object Iterator
		Iterator<Integer>itr = arraylist.iterator();
		while(itr.hasNext()) {
			Integer i= itr.next();
			if(i%2==0) {
				System.out.println(i);
			}
			else {
				itr.remove();
			}
		}
		System.out.println(arraylist);
		
	}

}

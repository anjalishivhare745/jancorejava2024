package com.as.Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		//Creating object LinkedList
		LinkedList <String> linkedList = new LinkedList<String>();
		linkedList.add("Anmol");
		linkedList.add("Raghav");
		linkedList.add("Raj");
		linkedList.add("Krishna");
		linkedList.add("Chirag");
		linkedList.add("Kairav");
		System.out.println(linkedList);
		
//		getting object of Listiterator
		ListIterator <String> listIterator = linkedList.listIterator();
		while(listIterator.hasNext()) {
			String str= listIterator.next();
			System.out.println(str);
			if(str.equals("Mohit")) {
				listIterator.remove();
			}
			if(str.equals("Chirag")) {
				listIterator.set("Chirag Shivhare");
			}
			if(str.equals("Anmol")) {
				listIterator.add("Anmol Shivhare");
			}
		}

		System.out.println(linkedList);
	}

}

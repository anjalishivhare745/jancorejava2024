package com.as.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {

		LinkedList <String> linkedList =new LinkedList<String>();
		
		linkedList.add("Anjali");
		linkedList.add("Anshika");
		linkedList.add("Janhvi");
		linkedList.add("Tammana");
		linkedList.add("Avni");
		linkedList.add("Kayra");
		linkedList.add(null);
		
		Iterator<String> itr = linkedList.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

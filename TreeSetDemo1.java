package com.as.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {

		TreeSet <String>treeset = new TreeSet<String>();
		
		treeset.add("A");
		treeset.add("B");
		treeset.add("C");
		treeset.add("D");
		treeset.add("E");
		treeset.add("F");
		
		Iterator<String> itr = treeset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

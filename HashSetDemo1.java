package com.as.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {

		HashSet <String>hashset = new HashSet<String>();
		
		hashset.add("Anmol");
		hashset.add("Chirag");
		hashset.add("Raj");
		hashset.add("Raghav");
		hashset.add("Krishna");
		hashset.add("Mohit");
		Iterator<String>itr = hashset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			hashset.forEach((e1)->{System.out.println(e1);});
		}
		
	}

}

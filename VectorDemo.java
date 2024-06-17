package com.as.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<String>();
		vector.add("Anjali");
		vector.add("Neha");
		vector.add("poonam");
		vector.add("Radha");
		vector.add("Sonam");
		vector.add("Bhumi");
		
		Enumeration<String>e = vector.elements();
		
		while(e.hasMoreElements()) {
		System.out.println(e.nextElement());	
		}
	}

}

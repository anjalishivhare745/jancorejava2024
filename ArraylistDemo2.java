package com.as.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo2 {

	public static void main(String[] args) {

		List <String> list = new ArrayList <String>();
		
		list.add("Anjali");
		list.add("Neha");
		list.add("Anjana");
		list.add("poonam");
		list.add("null");
	 System.out.println("iterate using iterator");	
		Iterator <String> itr = list.iterator();
		
	while(itr.hasNext()) {
	System.out.println(itr.next());
	}
	
	System.out.println("iterate using for each");
	for(String str: list) {
		System.out.println(str);
	}
	
	System.out.println("iterate using java 8 for each");
	list.forEach((a)->{System.out.println(a);});
	}

}

package com.as.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
  
	HashMap<Integer,String> hashmap = new HashMap<Integer , String>();
	
	hashmap.put(101,"Anjali");
	hashmap.put(102,"Chirag");
	hashmap.put(103,"Anmol");
	hashmap.put(104,"Raj");
	hashmap.put(102,null);
	hashmap.put(null,"Krishna");
	hashmap.put(null,"Raghav");
	hashmap.put(105,"Chirag");
	
	Iterator<Map.Entry<Integer, String>> itr = hashmap.entrySet().iterator();
	while(itr.hasNext()) {
		Map.Entry<Integer, String> entrymap = itr.next();
		System.out.println(entrymap.getKey()+" "+entrymap.getValue());
	}
	
	System.out.println("Iterate using for java 8");
	hashmap.forEach((key, value)->{System.out.println(key+" "+value);});

	}

}

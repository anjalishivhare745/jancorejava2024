package com.as.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Student2Client {

	public static void main(String[] args) {

		HashSet<Student2>hashset = new HashSet<Student2>();
		
		Student2 student3 = new Student2(103,"Anjali");
		Student2 student4 = new Student2(104,"Anshika");
			Student2 student5 = new Student2(105,"Janhvi");
			Student2 student6= new Student2(106,"Tammana");
			Student2 student7 = new Student2(107,"Avni");
			Student2 student8 = new Student2(108,"Kayra");
			
			hashset.add(student3);
			hashset.add(student4);
			hashset.add(student5);
			hashset.add(student6);
			hashset.add(student7);
			hashset.add(student8);
			
			Iterator itr= hashset.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
	}

}

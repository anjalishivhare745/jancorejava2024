package com.as.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Student1Client {

	public static void main(String[] args) {

		LinkedList<Student1> linkedList = new LinkedList<Student1>();
		
		Student1 student7 = new Student1(101,"Anjali");
	Student1 student2 = new Student1(102,"Anshika");
		Student1 student3 = new Student1(103,"Janhvi");
		Student1 student4 = new Student1(104,"Tammana");
		Student1 student5 = new Student1(105,"Avni");
		Student1 student6 = new Student1(106,"Kayra");
		
		linkedList.add(student7);
		linkedList.add(student2);
		linkedList.add(student3);
		linkedList.add(student4);
		linkedList.add(student5);
		linkedList.add(student6);
		
		Iterator itr = linkedList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("iterate using for loop");
		for(Student1 s1: linkedList) {
			System.out.println(s1);
		}
		
		
	}

}

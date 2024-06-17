package com.as.Collection;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

	public static void main(String[] args) {

		List <Student> list = new ArrayList<Student>();
		Student student1 = new Student(101,"Anjali");
				Student student2 = new Student(102,"Radha");
				Student student3 = new Student(103,"Neha");
				
				list.add(student1);
				list.add(student2);
				list.add(student3);
				
				System.out.println(list);
	}

}

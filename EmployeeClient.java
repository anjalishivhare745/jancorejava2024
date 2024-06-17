package com.as.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeClient {

	public static void main(String[] args) {

		TreeSet<Employee>treeset = new TreeSet<Employee>();
		
		Employee employee1 = new Employee(101,"Anjali");
		Employee employee2 = new Employee(102,"Akansha");
		Employee employee3= new Employee(103,"Neha");
		Employee employee4 = new Employee(104,"Nisha");
		Employee employee5 = new Employee(105, "Poonam");
		
		treeset.add(employee1);
		treeset.add(employee2);
		treeset.add(employee3);
		treeset.add(employee4);
		treeset.add(employee5);
	Iterator itr = treeset.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	for(Employee e1:treeset) {
		System.out.println(e1);
	}
	System.out.println(treeset);
	}
	

}

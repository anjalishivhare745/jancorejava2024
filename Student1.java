package com.as.Collection;

public class Student1 {

	private int id;
	private String name;
	
	public Student1(int id, String name) {
		super();
		this.id=id;
		this.name=name;
	}
	public int getid() {
		return id;
	}
	public void setid() {
		this.id=id;
	}
	public String getname() {
		return name;
		
	}
	public void setname() {
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student1[id="+id+", name="+name+"]";

	}


	
}
	
	
	
	
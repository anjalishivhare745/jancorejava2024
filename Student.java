package com.as.Collection;

public class Student {

	private int id;
	private String name;
	
	public Student(int id,String name) {
		super();
		this.id= id;
		this.name= name;
		}
	public int getid() {
		return id;
		
	}
	public void setid() {
		this.id = id;
	}
	
	public String getname() {
		return name;
	}
	public void  setname() {
		this.name= name;
	}
	@Override
	public String toString() {
		return "Student[id="+id+", name="+name+"]";
	}
}

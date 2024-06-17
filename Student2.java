package com.as.Collection;

import java.util.Objects;

public class Student2 {

	private int id;
	private String name;
	
	public Student2(int id, String name) {
		super();
		this.id=id;
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
	public void setname() {
		this.name=name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Student2[id="+id+",name="+name+"]";
	}
	
	
}

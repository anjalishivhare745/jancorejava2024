package com.as.Collection;

public class Employee implements Comparable<Employee> {

	private int id;
	
	private String name;
	
	public Employee(int id, String name) {
		
	
	this.id= id;
	this.name = name;
}
	
	public  int getid() {
		return id; 
	}
	public void setid(){
		this.id =id ;
		
	}
	public String getname() {
		return name;
		
	}
	public void setname() {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee e) {
        
        if(this.id<e.id) {
            return -1;
        }else if(this.id>e.id) {
            return 1;
        }else {
            return 0;
        }

	
	

}
}
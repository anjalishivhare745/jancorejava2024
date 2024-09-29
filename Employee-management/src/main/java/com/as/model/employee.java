package com.as.model;

import java.util.Locale;

public class employee {
	
	
	private int id;
	private String firstname;
	private String lastname;
	private String Education;
	private int age;
	private double salary;
	private String department;
	private String contact ;
	private Locale dateofjoining;
	private String Designation;
	private String adress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEducation() {
		return Education;
	}
	public void setEducation(String education) {
		Education = education;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Locale getDateofjoining() {
		return dateofjoining;
	}
	public void setDateofjoining(Locale dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "EmployeeController [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", Education="
				+ Education + ", age=" + age + ", salary=" + salary + ", department=" + department + ", contact="
				+ contact + ", dateofjoining=" + dateofjoining + ", Designation=" + Designation + ", adress=" + adress
				+ "]";
	}
	
	
}

package com.sunbeam;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getlastName() {
		return this.lastName;
	}
	
	public void setSalary(double salary) {
		if(this.salary > 0) {
			this.salary = salary;
		}
	}
	public double getSalary() {
		return this.salary;
	}
	
	public double yearlySalary() {
		return 12* this.salary;
	}
	
	public void display() {
		System.out.println("first name: "+ this.firstName);
		System.out.println("last name: "+ this.lastName);
		System.out.println("salary: "+ this.salary);
		System.out.println("Yearly salary: " + yearlySalary() + "\n");
	}
	
	public double raisedSalary(double percent) {
		return this.salary += this.salary * percent/100;
	}
	
}

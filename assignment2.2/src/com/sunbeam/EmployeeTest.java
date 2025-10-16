package com.sunbeam;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee e1 = new Employee("Ekta", "Sinha", 5000);
		Employee e2 = new Employee("Shruti", "Sendur", 8000);
//		e1.display();
//		e2.display();
		
		e1.raisedSalary(10);
		e2.raisedSalary(10);
		
		e1.display();
		e2.display();
	}

}

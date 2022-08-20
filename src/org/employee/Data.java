package org.employee;

public class Data {
	
	private void add() {
	short empId=12345;
	String empName="Lauren";
	String empEmail="Lauren@gmail.com";
	long empPhoneno=9876543210l;
	float salary=34000.789f;
	char empGender='F';// TODO Auto-generated method stub
    String empCity="Chennai";
	System.out.println("Employee Id is " + empId);
	System.out.println("Employee Name is " + empName);
	System.out.println("Employee Email is " + empEmail);
	System.out.println("Employee Phone number is " + empPhoneno);
	System.out.println("Employee Salary is " + salary);
	System.out.println("Employee Gender is " + empGender);
	System.out.println("Employee City is " + empCity);
	}
	
	private void employeedet() {
    System.out.println("Process Completed");
	}
public static void main(String[] args) {
	Data D=new Data();
	D.add();
	D.employeedet();
}
}

package core.java.work.model;

import core.java.work.constant.Gender;
import lombok.Data;

@Data
public class Employee {

	
	private int number;
	private String name;
	private double salary;
	private int age;
	private static String COMPANY_NAME;
	private int id;
	private Gender gender;
	
	{
		salary = 1000;
		
	}
	
	static {
		COMPANY_NAME = "XYZ Comp";
	}
	
	public Employee() {
	
	}
	Employee(Employee emp){
		number = emp.number;
		name = emp.name;
		salary = emp.salary;
		age = emp.age;
	}
	
	public Employee(int number, String name, double salary, int age) {
		this.number = number;
		this.name = name;
		this.salary = salary;
		this.age = age;
		
	}
	public Employee(int id, int number, String name, double salary, int age, Gender gender) {
		this.id = id;
		this.number = number;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
		
		
	}
	
	/// Copy constructor
	public double calculateHRA(){
	
		return   0.20 * salary ;
		
	}
	
	public void dispaly(){
		System.out.println("Employee ID: " + this.id);
		System.out.println("Employee Number: " + this.number);
		System.out.println("Employee Name: " + this.name);
		System.out.println("Employee Salary: " + this.salary);
		System.out.println("Employee Age: " + this.age);
		System.out.println("Employee Gender: " + this.gender);
	}
	
	public String getComapanyName() {
		
		return COMPANY_NAME;
	}
	
	
}

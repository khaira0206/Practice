package core.java.work.view;

import java.util.Scanner;

import core.java.exception1.controller.EmployeeNotFoundException;
import core.java.work.constant.Gender;
import core.java.work.controller.EmployeeArrayOperationsImpl;
import core.java.work.controller.EmployeeUtil;
import core.java.work.model.Employee;

public class EmployeeOperationsApp {

	static int number = 0;

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		int n;
		String name;
		double salary, grossSalary, hra;
		int age;
		int id, exitingid;
		Gender gender = null;
		Employee exitingEmp;
		do {
		System.out.println("How Many Empoyees you wish to create ");
		n = sc.nextInt();
		}while(n == 0);
		EmployeeArrayOperationsImpl empImp = new EmployeeArrayOperationsImpl(n);
		do {

			System.out.println(" || MENU ||");

			System.out.println(" 1. Create Employee");
			System.out.println(" 2. View Employee");
			System.out.println(" 3. View All Employee");
			System.out.println(" 4. Update An Employee");
			System.out.println(" 5. Delete An Employee");
			System.out.println(" 6. Calculate HRA");
			System.out.println(" 7. Calculate Gross Salary");
			System.out.println(" 8. Exit");
			System.out.println();

			System.out.println(" Select a Choice: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter the id: ");
				id = sc.nextInt();
				System.out.println("Enter the first name: ");
				name = sc.next();
				System.out.println("Enter the last name: ");
				name += " " + sc.next();
				System.out.println("Enter the salary: ");
				salary = sc.nextDouble();
				System.out.println("Enter the age: ");
				age = sc.nextInt();
				System.out.println("Select gender: ");
				System.out.println(" 1. Male ");
				System.out.println(" 2. Female ");
				int val = sc.nextInt();
				if (val == 1) {
					gender = Gender.MALE;
				} else if (val == 2) {
					gender = Gender.FEMALE;
				}

				Employee emp = EmployeeUtil.createEmployee(id, val, name, salary, age, gender);

				empImp.add(emp);
				break;

			case 2:
				System.out.println("Enter the id of employee you want to view: ");
				exitingid = sc.nextInt();
				exitingEmp = empImp.getEmployee(exitingid);
				if (exitingEmp != null) {
					empImp.dispEmployee(exitingid);
				} else {
					System.out.println("Employee doesn't exist :");
				}
				break;
			case 3:
				empImp.dispAllEmployee();
				break;
			case 4:
				System.out.println("Enter the id of employee you want to update: ");
				exitingid = sc.nextInt();
				exitingEmp = empImp.getEmployee(exitingid);
				if (exitingEmp != null) {

					System.out.println("Enter the id: ");
					id = sc.nextInt();
					if (id != exitingEmp.getId()) {
						exitingEmp.setId(id);
					}
					System.out.println("Enter the first name: ");
					name = sc.next();
					System.out.println("Enter the last name: ");
					name += " " + sc.next();
					if (!name.equals(exitingEmp.getName())) {
						exitingEmp.setName(name);
					}
					System.out.println("Enter the salary: ");
					salary = sc.nextDouble();
					if (salary != exitingEmp.getSalary()) {
						exitingEmp.setSalary(salary);
					}
					System.out.println("Enter the age: ");
					age = sc.nextInt();
					if (exitingEmp.getAge() != age) {
						exitingEmp.setAge(age);
					}
					System.out.println("Select gender: ");
					System.out.println(" 1. Male ");
					System.out.println(" 2. Female ");
					val = sc.nextInt();
					if (val == 1) {
						gender = Gender.MALE;
					} else if (val == 2) {
						gender = Gender.FEMALE;
					}
					if (exitingEmp.getGender() != gender) {
						exitingEmp.setGender(gender);
					}

					empImp.updateEmployee(exitingid, exitingEmp);
				} else {
					System.out.println("Employee with given id doesn't exist");
				}
				break;
			case 5:
				System.out.println("Enter the id of employee you want to delete: ");
				exitingid = sc.nextInt();
				exitingEmp = empImp.getEmployee(exitingid);
				if (exitingEmp != null) {
					empImp.deleteEmployee(exitingid);
				}
				break;
			case 6:
				System.out.println("Enter Id of the emp to calculate the HRA :");
				exitingid = sc.nextInt();
				exitingEmp = empImp.getEmployee(exitingid);
				if (exitingEmp != null) {
					hra = empImp.calculateHRA(exitingEmp);
					System.out.println("Employee's HRA is :" + hra);
				} else {
					System.out.println("Employee doesn't exist");
				}

				break;
			case 7:
				System.out.println("Enter Id of the emp to calculate the gross salary :");
				exitingid = sc.nextInt();
				exitingEmp = empImp.getEmployee(exitingid);
				if (exitingEmp != null) {
					grossSalary = EmployeeUtil.calculateGrossSalary(exitingEmp);
					System.out.println("Employee's Gross salary is :" + grossSalary);
				} else {
					System.out.println("Employee doesn't exist");
				}

				break;
			case 8:
				return;
			}

		} while (true);

	}

}

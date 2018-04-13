package core.java.work.controller;

import core.java.work.constant.Gender;
import core.java.work.model.Employee;

public class EmployeeUtil {

	public static Employee highestSalary(Employee e1, Employee e2) {

		if (e1 == null || e2 == null)
			return null;

		return e1.getSalary() > e2.getSalary() ? e1 : e2;
	}

	public static void increaseSalary(Employee e1) {

		e1.setSalary((int) (e1.getSalary() * 1.1));
	}

	public static Employee createEmployee(int number, String name, double salary, int age) {

		Employee emp = new Employee(number, name, salary, age);
		return emp;

	}

	public static Employee createEmployee(int id, int number, String name, double salary, int age, Gender gender) {

		Employee emp = new Employee(id, number, name, salary, age, gender);
		return emp;

	}

	public static Employee getElder(Employee e1, Employee e2) {

		if (e1 == null || e2 == null)
			return null;

		return e1.getAge() > e2.getAge() ? e1 : e2;
	}

	public static void updateSalary(Employee emp) {

		if (emp.getSalary() < 10000 && emp.getAge() > 35) {
			emp.setSalary((int) (emp.getSalary() * 1.15));
		} else if (emp.getSalary() < 15000 && emp.getAge() > 45) {
			emp.setSalary((int) (emp.getSalary() * 1.2));
		} else if (emp.getSalary() < 20000 && emp.getAge() > 55) {
			emp.setSalary((int) (emp.getSalary() * 1.25));
		}
	}

	public static double calculateGrossSalary(Employee emp) {

		double totalSalary = 0;
		double da = 0;
		double hra = 0;

		if (emp.getSalary() < 10000) {
			da = emp.getSalary() * 0.08;
			hra = emp.getSalary() * 0.15;
		} else if (emp.getSalary() < 20000) {
			da = emp.getSalary() * 0.1;
			hra = emp.getSalary() * 0.2;
		} else if (emp.getSalary() < 30000 && emp.getAge() >= 40) {
			da = emp.getSalary() * 0.15;
			hra = emp.getSalary() * 0.27;
		} else if (emp.getSalary() < 30000 && emp.getAge() < 40) {
			da = emp.getSalary() * 0.13;
			hra = emp.getSalary() * 0.25;
		} else {
			da = emp.getSalary() * 0.17;
			hra = emp.getSalary() * 0.30;
		}
		totalSalary = emp.getSalary() + da + hra;
		return totalSalary;

	}

}

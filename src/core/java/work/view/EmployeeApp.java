package core.java.work.view;

import core.java.work.controller.EmployeeUtil;
import core.java.work.model.Employee;

public class EmployeeApp {

	public static void main(String arg[]) {

		Employee e1 = EmployeeUtil.createEmployee(1, "John", 36000, 25);
		Employee e2 = EmployeeUtil.createEmployee(2, "cathy", 2999, 30);
		Employee e3 = EmployeeUtil.highestSalary(e1, e2);
		System.out.println("Highest paid :" + e3.getName());
		EmployeeUtil.increaseSalary(e2);
		e3 = EmployeeUtil.highestSalary(e1, e2);
		System.out.println("Highest paid :" + e3.getName());

		EmployeeUtil.increaseSalary(e1);
		EmployeeUtil.updateSalary(e1);
		System.out.println(EmployeeUtil.calculateGrossSalary(e1));

	}
}

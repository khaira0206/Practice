package core.java.exception1.controller;

import core.java.work.constant.Gender;
import core.java.work.controller.CrudOperations;
import core.java.work.model.Employee;

public class EmployeeArrayOperationsImpl implements CrudOperations {

	int idx = 0;
	Employee[] arr;

	public EmployeeArrayOperationsImpl(int n) {
		arr = new Employee[n];
	}

	public Employee getEmployee(int id) throws EmployeeNotFoundException {
		boolean status = false;
		for (Employee emp : arr) {
			if (emp != null && emp.getId() == id) {
				status = true;
				return emp;
			}
		}
		if (!status) {
			throw new EmployeeNotFoundException("Given id is Invalid. Please provide valid employee id");
		}
		return null;
	}

	public void add(Employee emp) throws InvalidSalaryException {

		if (arr != null) {
			if (emp.getSalary() < 5000) {
				throw new InvalidSalaryException("Salary should greater than 5000");
			}
			arr[idx++] = emp;

		}

	}

	public void deleteEmployee(int id) throws EmployeeNotFoundException {
		int i = 0;
		for (Employee emp : arr) {
			if (emp != null && id == emp.getId()) {
				if (idx > 1) {
					arr[i] = arr[idx];
					arr[idx--] = null;
				} else {
					arr[i] = null;
				}
			}
			i++;
		}
	}

	public void updateEmployee(int id, Employee emp) throws EmployeeNotFoundException, InvalidSalaryException {
		int i = 0;
		boolean status = false;
		for (Employee employee : arr) {
			if (employee.getId() == id) {
				status = true;
				if (emp.getSalary() < 5000) {
					throw new InvalidSalaryException("Salary should greater than 5000");
				}
				arr[i] = emp;
			}
			i++;
		}

		if (!status) {

			throw new EmployeeNotFoundException("Given id is Invalid. Please provide valid employee id");
		}
	}

	public void dispEmployee(int id) throws EmployeeNotFoundException {

		boolean status = false;
		for (Employee employee : arr) {
			if (employee.getId() == id) {
				status = true;
				employee.dispaly();

			}

		}
		if (!status) {

			throw new EmployeeNotFoundException("Given id is Invalid. Please provide valid employee id");
		}

	}

	public void dispAllEmployee() {

		for (Employee employee : arr) {
			if (employee != null) {
				employee.dispaly();
				System.out.println();
			}
		}
	}

	public double calculateHRA(Employee emp) {

		return emp.calculateHRA();
	}

}

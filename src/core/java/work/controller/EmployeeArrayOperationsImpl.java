package core.java.work.controller;

import core.java.work.constant.Gender;
import core.java.work.model.Employee;

public class EmployeeArrayOperationsImpl implements CrudOperations {

	int idx = 0;
	Employee[] arr;

	public EmployeeArrayOperationsImpl(int n) {
		arr = new Employee[n];
	}

	public Employee getEmployee(int id) {

		for (Employee emp : arr) {
			if (emp != null && emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

	public void add(Employee emp) {

		arr[idx++] = emp;

	}

	public void deleteEmployee(int id) {
		int i = 0;
		for (Employee emp : arr) {
			if (emp != null && id == emp.getId()) {
				if(idx > 1) {
				arr[i] = arr[idx];
				arr[idx--] = null;
				}
				else {
					arr[i] = null;
				}
			}
			i++;
		}
	}

	public void updateEmployee(int id, Employee emp) {
		int i = 0;
		for (Employee employee : arr) {
			if (employee != null && employee.getId() == id) {
				arr[i] = emp;
			}
			i++;
		}
	}

	public void dispEmployee(int id) {
		int i = 0;
		for (Employee employee : arr) {
			if (employee != null && employee.getId() == id) {
				employee.dispaly();
				return;
			}
			i++;
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

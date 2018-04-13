package core.java.work.controller;

import core.java.exception1.controller.EmployeeNotFoundException;
import core.java.exception1.controller.InvalidSalaryException;
import core.java.work.model.Employee;

public interface CrudOperations {

	void add(Employee emp) throws InvalidSalaryException;

	Employee getEmployee(int id) throws EmployeeNotFoundException;

	void deleteEmployee(int id) throws EmployeeNotFoundException;

	void updateEmployee(int id, Employee emp) throws EmployeeNotFoundException, InvalidSalaryException;

	void dispEmployee(int id) throws EmployeeNotFoundException;

	void dispAllEmployee();

}

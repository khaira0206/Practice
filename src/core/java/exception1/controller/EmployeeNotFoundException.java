package core.java.exception1.controller;

public class EmployeeNotFoundException extends RuntimeException {

	public EmployeeNotFoundException() {

	}

	public EmployeeNotFoundException(String mess) {
		super(mess);
	}

	public EmployeeNotFoundException(Throwable obj) {
		super(obj);
	}

	public EmployeeNotFoundException(String mess, Throwable obj) {
		super(mess, obj);
	}

}

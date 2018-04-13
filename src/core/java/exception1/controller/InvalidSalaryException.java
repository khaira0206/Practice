package core.java.exception1.controller;

public class InvalidSalaryException extends Exception {

	public InvalidSalaryException(String mess, Throwable obj) {
		super(mess, obj);
	}

	public InvalidSalaryException(String mess) {
		super(mess);
	}
}

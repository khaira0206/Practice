package core.java.ER;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee extends Person {
	private int empID;
	private int extension;
	private String email;
	private int officeCode;
	private Employee supervisor;
	
	//See Enum
	@Getter @ Setter (AccessLevel.NONE) JobTitle jobTitle;
	
	public Employee(int empID, int extension, String email, int officecode, Employee supervisor) {
		this.empID = empID;
		this.extension =extension;
		this.email =email;
		this.officeCode = officecode;
		this.supervisor = supervisor;
		
	}
	
	//Some Employee related methods
}


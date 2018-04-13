package core.java.ER;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Office {
	int officeID;
	Address officeAddress;
	String territory;
	
	@Getter @Setter List<Employee> employees;
}

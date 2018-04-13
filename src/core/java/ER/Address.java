package core.java.ER;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

	
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String country;
	private int zipcode;
	
	
	public Address(String addressLine1, String addressLine2, String city, String state, String country, 
			int zipcode) {
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		
	}

}

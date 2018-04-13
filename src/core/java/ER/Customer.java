package core.java.ER;


import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;

@Getter
@Setter
public class Customer extends Person {
	
	private int custID;
	private String customerName;
	private double creditLimit;
	private int salesRepID;
	private Address address;
	private String phoneNumber;
	private int age;
	
	private List<Order> orders;
	private List<Payment> payments;
	
	//Constructors
	
	public Customer(int custID, String customerName, double creditLimit, int salesRepID, Address address, String phoneNumber, 
			int age, List<Order> orders,List<Payment> payments) {
		this.custID = custID;
		this.customerName = customerName;
		this.creditLimit = creditLimit;
		this.salesRepID = salesRepID;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.orders = orders;
		this.payments = payments;
		
		
	}
	
	//Some customer related methods
	
}

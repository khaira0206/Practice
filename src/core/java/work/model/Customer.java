package core.java.work.model;

public class Customer {

	private int id;
	private String name;
	private String gender;
	private String address;
	
	public Customer() {
		
	}
	public Customer(int id, String name, String gender, String address) {
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}
	
}

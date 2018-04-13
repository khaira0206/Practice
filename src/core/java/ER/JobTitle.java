package core.java.ER;

public enum JobTitle {
MR("Manager"), CH("Cashier"), SC("Stock Handler"), DR("Delivery"), SK("Something"), VB("Somethingmore");
	
	private String jobCode;

	private JobTitle(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getJobCode() {
		return this.jobCode;
	}  
}

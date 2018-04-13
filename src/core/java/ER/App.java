package core.java.ER;

import core.java.ER.CustomerEligiBilityVerifier.CustomerEligibilityVerifier;

public class App {

	public static void main(String[] args) {
		
		
		Customer customer = CustomerUtility.createCustomer();
		Employee employee = CustomerUtility.createEmployee();
		Order order = CustomerUtility.createOrder();
		
		System.out.println("---------Displaying Customer-------- ");
		System.out.println();
		System.out.println("Customer Id :: " + customer.getCustID());
		System.out.println("Customer name :: " + customer.getCustomerName());
		System.out.println("Customer Credit Limit :: " + customer.getCreditLimit());
		System.out.println("Customer Sales Rep ID :: " + customer.getSalesRepID());
		System.out.println("Customer Address :: " + CustomerUtility.printAddress(customer.getAddress()));
		System.out.println("Customer Phone Number :: " + customer.getPhoneNumber());
		System.out.println("Customer Age :: " + customer.getAge());
		System.out.println();
		System.out.println("---------Displaying Employee--------- ");
		System.out.println();
		System.out.println("Employee ID :: " + employee.getEmpID());
		System.out.println("Employee Extension :: " + employee.getExtension());
		System.out.println("Employee Email :: " + employee.getEmail());
		System.out.println("Employee OfficeCode :: " + employee.getOfficeCode());
		System.out.println("Supervisor :: "+ employee.getSupervisor());
		System.out.println();
		System.out.println("---------Displaying Order------------ ");
		System.out.println();
		System.out.println("Order Id :: " + order.getOrderID());
		System.out.println("Order Date :: "+ order.getOrderDate());
		System.out.println("Required date :: " + order.getRequiredDate());
		System.out.println("Shipping Date :: "+ order.getShippingDate());
		System.out.println("Status :: " + order.getStatus());
		System.out.println("Comments :: " + order.getStatus());
		
		System.out.println();
		System.out.println("---------Order Details------------ ");
		System.out.println();
		System.out.println("Customer Number :: " + customer.getCustID());
		double amount = 0;
		for(ProductLineItem prdctLine: order.getOrderDetails()) {
			System.out.println("Product Name :: " +prdctLine.getProductName());
			System.out.println("Price :: "+ prdctLine.getPriceEach());
			System.out.println("Quantity Ordered :: " + prdctLine.getQuantityOrdered());
			System.out.println();
			amount += prdctLine.getQuantityOrdered() * prdctLine.getPriceEach();
		}
		System.out.println("Total Amount to be paid :: " + amount);
		
		CustomerEligibilityVerifier verifier = (CustomerEligibilityVerifier) new CustomerAgeEligiBilityVerifier();
		verifier.isEligible(customer);
		verifier = (CustomerEligibilityVerifier) new CustomerCreditEligiBilityVerifier();
		verifier.isEligible(customer);
	}
}

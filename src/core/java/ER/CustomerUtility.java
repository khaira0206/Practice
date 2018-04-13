package core.java.ER;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerUtility {

	public static Order createOrder() {

		ProductLineItem productLineItem1 = new ProductLineItem(10103, "S10_1949", "1952 Alpine Renault 1300",
				"Turnable front wheels; steering function; detailed interior; detailed engine; opening hood;"
						+ " opening trunk; opening doors; and detailed chassis.",
				26, 214.30, 11);

		ProductLineItem productLineItem2 = new ProductLineItem(10103, "S10_1678",
				"1969 Harley Davidson Ultimate Chopper",
				"This replica features working kickstand, front suspension, gear-shift lever, footbrake lever, drive chain,"
						+ " wheels and steering. All parts are particularly delicate due to their precise scale and require special"
						+ " care and attention.",
				30, 81.35, 2);

		ProductLineItem productLineItem3 = new ProductLineItem(10103, "S18_1662", "1980s Black Hawk Helicopter",
				"1:18 scale "
						+ "replica of actual Army's UH-60L BLACK HAWK Helicopter. 100% hand-assembled. Features rotating rotor blades,"
						+ " propeller blades and rubber wheels.",
				38, 138.77, 5);

		List<ProductLineItem> orderDetails = new ArrayList<ProductLineItem>();
		orderDetails.add(productLineItem1);
		orderDetails.add(productLineItem2);
		orderDetails.add(productLineItem3);

		Date orderDate = new Date(2018 - 04 - 01);
		Date requiredDate = new Date(2018 - 04 - 15);
		Date shippingDate = new Date(2018 - 04 - 04);

		Order order = new Order(10103, orderDate, requiredDate, shippingDate, "created", "Difficult to negotiate with customer. "
				+ "We need more marketing materials", orderDetails);
		

		return order;

	}

	public static Customer createCustomer() {

		Address address = new Address("54, rue Royale", null, "Nantes", null, "France", 44000);

		Order order = createOrder();
		order.setCustID(103);
		List<Order> orders = new ArrayList<Order>();
		orders.add(order);
		
		Date paymentDate = new Date(2018 - 04 - 01);
		
		double amount = 0.0;
		
		for(Order ordr : orders) {
			for(ProductLineItem prdctLine: ordr.getOrderDetails()) {
			double totalPrice = prdctLine.getQuantityOrdered() * prdctLine.getPriceEach();
			amount += totalPrice;
			}
		}
		
		Payment payment1 = new Payment(PaymentMethod.CREDITCARD, paymentDate, amount);
		Payment payment2 =new Payment(PaymentMethod.CHECK, paymentDate, amount);
		List<Payment> payments = new ArrayList<Payment>();

		payments.add(payment1);
		payments.add(payment1);

		return new Customer(103, "Atelier graphique", 21000.00, 1370, address, "40.32.2555", 26, orders, payments);
	}

	
	public static Employee createEmployee() {
		
		return new Employee(101, 1, "abc@gmail.com", 5,null);
		
	}
	
	public static String printAddress(Address address) {
		return  address.getAddressLine1() +" "+ address.getAddressLine2() +" "+ address.getCity() +" "+ address.getState() +" " + address.getCountry() +" "+ address.getZipcode();
		
	}
	
}

package core.java.ER;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
	
	private int custID;
	private int orderID;
	private Date orderDate;
	private Date requiredDate;
	private Date shippingDate;
	private String status; // enum ?
	private String comments;

	private List<ProductLineItem> orderDetails;

	public Order(int orderID, Date orderDate, Date requiredDate, Date shippingDate, String status, String comments,
			List<ProductLineItem> orderDetails) {

		this.orderID = orderID;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippingDate = shippingDate;
		this.status = status;
		this.comments = comments;
		this.orderDetails = orderDetails;

	}
}

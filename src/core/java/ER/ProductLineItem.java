package core.java.ER;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductLineItem {
	private int orderID;
	private String productCode;
	private String productName;
	private String productDescription;
	private int quantityOrdered;
	private double priceEach;
	private int orderLineNumber;
	
	public ProductLineItem(int orderID, String productCode, String productName, String productDescription,
			int quantityOrdered, double priceEach, int orderLineNumber) {
		
		this.orderID = orderID;
		this.productCode = productCode;
		this.productName = productName;
		this.productDescription = productDescription;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
		
	}
	
	
}
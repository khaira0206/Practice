package core.java.ER;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
	private String productCode;
	private String productName;
	private String productVendor;
	private String productDescription;
	private int quantityInStock;
	private double buyPrice;
	private double sellPrice;
	private ProductLine productLine;

	public Product(String productCode, String productName, String productVendor, String productDescription,
			int quantityInStock, double buyPrice, double sellPrice, ProductLine productLine) {

		this.productCode = productCode;
		this.productName = productName;
		this.productVendor = productVendor;
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
		this.productLine = productLine;
	}

}
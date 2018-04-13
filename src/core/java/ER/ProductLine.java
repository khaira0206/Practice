package core.java.ER;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductLine {
	private String productLine;
	private String textDescription;
	private String htmlDescription;
	private byte[] image;
	
	List<Product> products;
	
	public ProductLine(String productLine, String textDescription, String htmlDescription, byte[] image) {
		
		this.productLine = productLine;
		this.textDescription = textDescription;
		this.htmlDescription = htmlDescription;
		this.image = image;
	}
	
	//Methods
	
}

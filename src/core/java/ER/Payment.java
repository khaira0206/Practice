package core.java.ER;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {
	
	private PaymentMethod paymentMethod;
	private Date paymentDate;
	private double amount;
	
	public Payment(PaymentMethod paymentMethod, Date paymentDate, double amount) {
		
		this.paymentMethod = paymentMethod;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}
	
	//Payment related methods.
}

package core.java.ER;

public class CustomerCreditEligiBilityVerifier implements CustomerEligiBilityVerifier {

	public boolean isEligible(Customer customer) {
		return customer.getCreditLimit() > 650 && customer.getCreditLimit() < 750;
	}
	
}

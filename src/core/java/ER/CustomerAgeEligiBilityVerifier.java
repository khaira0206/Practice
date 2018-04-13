package core.java.ER;

public class CustomerAgeEligiBilityVerifier implements CustomerEligiBilityVerifier {

	public boolean isEligible(Customer customer) {
		return customer.getAge() > 25 && customer.getAge() < 45;
	}
}

package core.java.ER;

public interface CustomerEligiBilityVerifier {

	@FunctionalInterface
	public interface CustomerEligibilityVerifier {
		boolean isEligible(Customer customer);
	}
}

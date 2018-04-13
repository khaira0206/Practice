package core.java.ER;

public enum PaymentMethod {

	CHECK(1), CASH(2), CREDITCARD(3), GIFTCARD(4);

	PaymentMethod(int val) {
		this.val = val;
	}

	private int val;

	public int getVal() {
		return val;
	}
}

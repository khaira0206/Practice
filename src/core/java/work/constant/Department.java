package core.java.work.constant;

public enum Department {

	SALES(10), PURCHASE(20), ADMINISTRATION(30), RESEARCH (40);
	
	Department(int val){
		this.val = val;
	}
	
	private int val;
	public int getVal() {
		return val;
	}
	
	
}

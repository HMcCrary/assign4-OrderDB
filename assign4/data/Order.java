package data;

public class Order {
	private int orderId;
	private String product;
	private double totalAmt;
	
	public Order(int orderId, String product, double totalAmt) {
		this.orderId = orderId;
		this.product = product;
		this.totalAmt = totalAmt;
	}
	
	public Order() {
		
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public String getProduct() {
		return product;
	}
	
	public double getTotalAmt() {
		return totalAmt;
	}
	
}




package data;

public class Driver {

	public static void main(String[] args) {
		OrderDB orderDatabase = new OrderDB();
		
		orderDatabase.loadOrders("orders.txt");
		orderDatabase.showOrders();
	}

}

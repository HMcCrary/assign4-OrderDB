package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class OrderDB {
	
	private Order[] orders;
	private int count;
	
	public OrderDB() {
		orders = new Order[50];
		count = 0;
	}
	
	
	public void loadOrders(String filename){
		try {
			File file = new File(filename);
			Scanner input = new Scanner(file);
			
			if (input.hasNextLine()) {
				input.nextLine();
			}
			while(input.hasNextLine() && count < orders.length) {
				String line = input.nextLine();
				
				String[] parts = line.split(",");
				
				int orderId = Integer.parseInt(parts[0]);
				String product = parts[2];
				double totalAmt = Double.parseDouble(parts[3]);
				
				orders[count] = new Order(orderId, product, totalAmt);
				count++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + filename);
		}
		
	}
	
	public void showOrders() {
		int i;
		
		System.out.printf("%-10s %-30s %10s%n","Order ID", "Product", "Total Amt");
		
		System.out.printf("%-10s %-30s %10s%n","--------", "---------------------------------------", "--------");
		
		for(i = 0; i < count; i++) {
			System.out.printf("%-10s %-30s %10s%n", orders[i].getOrderId(), orders[i].getProduct(), orders[i].getTotalAmt());
		}
		
	}
}

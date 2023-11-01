package FoodOrderApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Order {
	
	MenuApp menu = new MenuApp();
	LocalDateTime current = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
	String date_time = current.format(formatter);
	int order_no;
	int item_id[];
	String item_name[];
	int order_qty[];
	int total_price[] = {350*3, 150*1, 200*6};
	int tp = total_price[0]+total_price[1]+total_price[2];
	
	void getData(int order_no, int item_id[], String item_name[], int quantity[]) {
		this.order_no = order_no;
		this.item_id = item_id;
		this.item_name = item_name;
		this.order_qty = quantity;
	}
	void display() {
		System.out.println("Order Details: ");
		System.out.println("Date and Time: "+date_time);
		System.out.println("Order Number: "+order_no);
		System.out.println("Item ID(s): "+ Arrays.toString(item_id));
		System.out.println("Item Name(s): "+ Arrays.toString(item_name));
		System.out.println("Quantity of each item ordered: "+ Arrays.toString(order_qty));
		System.out.println("Bill TOTAL = Rs."+tp);
	}
	
	
}

package FoodOrderApp;

//import java.util.Scanner;


public class Customer {
	
	String name;
	int c_id;
	String address;
	int phone_no;
	String email_id;
	String location;
	Order order = new Order();
	int cust_tot = order.tp;
	Customer(){}
	
	void getData(String name, int c_id, String address, int phone_no, String email_id,String location) {
		this.name = name;
		this.c_id = c_id;
		this.address = address;
		this.phone_no = phone_no;
		this.email_id = email_id;
		this.location = location;
	}
	void display() {
		System.out.println("Customer Details: ");
		System.out.println("Name: "+name);
		System.out.println("Customer ID: "+c_id);
		System.out.println("Address: "+ address);
		System.out.println("Phone Number: "+phone_no);
		System.out.println("Email ID: "+email_id);
		System.out.println("Location: "+location);
		//System.out.println(cust_tot);
	}
}


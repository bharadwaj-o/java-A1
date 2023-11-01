package FoodOrderApp;

public class Guest extends Customer {
		Guest(int cust_tot){
			super();
			int delivery = 100;
			super.cust_tot = cust_tot + delivery;
			//super.display();
			this.cust_tot = super.cust_tot;
		}
		void paybill() {
			System.out.println("Final Bill (Guest) = Rs."+cust_tot);
		}
		
	}

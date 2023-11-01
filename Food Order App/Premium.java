package FoodOrderApp;

public class Premium extends Customer{
	Premium(int cust_tot){
		super();
		int p_disc = 20;
		int points;
		if (cust_tot>1000) {
			points= cust_tot/10;
		super.cust_tot = cust_tot - p_disc*cust_tot/100;
		//super.display();
		this.cust_tot = super.cust_tot;
	}
	}
	void paybill() {
		System.out.println("Final Bill (Premium) = Rs."+cust_tot);
	}
}
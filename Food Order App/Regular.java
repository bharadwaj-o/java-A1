package FoodOrderApp;

public class Regular extends Customer{
	Regular(int cust_tot){
		super();
		int r_disc = 10;
		super.cust_tot = cust_tot - r_disc*cust_tot/100;
		//super.display();
		this.cust_tot = super.cust_tot;
	}
	void paybill() {
		System.out.println("Final Bill (Regular) = Rs."+cust_tot);
	}
}
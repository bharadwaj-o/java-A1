package FoodOrderApp;

public interface PayBill {
	
	String c_id="";
	Order order = new Order();
	double cust_tot = order.tp;
	double p_disc = 0.2;
	int points = 0;
	double r_disc = 0.1;
	int delivery = 100;
	
	default void paybill_p(double cust_tot) {
		cust_tot = cust_tot - p_disc*cust_tot;
		}
	default void paybill_r(double cust_tot) {
		cust_tot = cust_tot - r_disc*cust_tot;
		}
	default void paybill_g(double cust_tot) {
		cust_tot = cust_tot + delivery ;
		}
	}
	

package FoodOrderApp;

//import java.util.Arrays;
import java.util.Scanner;

public class FoodOrderApp {

	public static void main(String[] args) {
		Customer c = new Customer();
		Guest g = new Guest(c.cust_tot);
		Regular r = new Regular(c.cust_tot);
		Premium p = new Premium(c.cust_tot);
		Order o = new Order();
		MenuApp m = new MenuApp();
		try (Scanner sc = new Scanner(System.in)) {
			c.getData("Paul",10900,"Penny Lane",6355635,"paulmc@gmail.com","Liverpool");
			o.getData(1, new int[] {103,201,302} , new String[] {"Butter Garlic Prawns", "Paneer Tikka", "Gimlet"}, new int[] {3,1,6});
			m.displayN();
			System.out.println(" N - Non-Vegetarian \n V - Vegetarian \n D - Drinks \n E - Exit Menu \nPlease enter the letter corresponding to the required Menu: ");
			String menu_type = sc.next();
			System.out.println(menu_type);
			while(menu_type!="E") {
				if (menu_type == "N") {
				m.displayN();
			}
				else if (menu_type == "V") {
				m.displayV();
			}
				else if (menu_type == "D") {
				m.displayD();
			}
				//else if (menu_type == "E" || menu_type == "e") {
				//break;}
				else {
				System.out.println("Please Enter a valid input");
			}
				System.out.println(" N - Non-Vegetarian \n V - Vegetarian \n D - Drinks \n E - Exit Menu \nPlease enter the letter corresponding to the required Menu: ");
				menu_type = sc.next();
			}
		}
		
		if (c.c_id<1000 ) {p.paybill();}
		
		else if (c.c_id>1000 && c.c_id<10000) {r.paybill();}

		else{g.paybill();}
		}


	}


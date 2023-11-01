package FoodOrderApp;

import java.util.Arrays;

public class MenuApp {
	
	int ns_id[]= {101,102,103};
	String n_starter[] = {"Chicken 65", "Apollo Fish", "Butter Garlic Prawns"};
	int ns_price[] = {200,400,350};
	String ns_description;
	int vs_id[]= {201,202,203};
	String v_starter[] = {"Paneer Tikka", "Creamy Mushroom Masala", "Potato Fingers"};
	int vs_price[] = {150,300,140};
	String vs_description;
	int drinks_id[]= {301,302,303};
	String drinks[] = {"Fruit Punch", "Gimlet", "Water"};
	int drinks_price[] = {110,200,20};
	String drinks_description;
	void displayN() {
		System.out.println("NON-VEGETARIAN MENU: ");
		System.out.println("Non-Vegetarian Starters: "+Arrays.toString(n_starter));
		System.out.println("Price: "+Arrays.toString(ns_price));	
		System.out.println();
	}
	void displayV() {
		System.out.println("VEGETARIAN MENU: ");
		System.out.println("Vegetarian Starters: "+Arrays.toString(v_starter));
		System.out.println("Price: "+Arrays.toString(vs_price));
		System.out.println();
		
	}
	void displayD() {
		System.out.println("DRINKS MENU: ");
		System.out.println("Drinks: "+Arrays.toString(drinks));
		System.out.println("Price: "+Arrays.toString(drinks_price));
		System.out.println();
	}
}

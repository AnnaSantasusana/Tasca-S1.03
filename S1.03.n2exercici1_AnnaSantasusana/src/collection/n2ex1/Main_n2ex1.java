package collection.n2ex1;

import java.util.HashSet;

public class Main_n2ex1 {

	public static void main(String[] args) {
		
		HashSet<Restaurant> scoreRestaurants = new HashSet<>();
		
		Restaurant rest1 = new Restaurant("Circus", 8);
		Restaurant rest2 = new Restaurant("Circus", 6);
		Restaurant rest3 = new Restaurant("Sibar", 9);
		Restaurant rest4 = new Restaurant("Sibar", 9);
		Restaurant rest5 = new Restaurant("Pepe", 6);
		Restaurant rest6 = new Restaurant("Golden", 4);
		Restaurant rest7 = new Restaurant("Golden", 4);
		Restaurant rest8 = new Restaurant("Gispert", 9);
		
		scoreRestaurants.add(rest1);
		scoreRestaurants.add(rest2);
		scoreRestaurants.add(rest3);
		scoreRestaurants.add(rest4);
		scoreRestaurants.add(rest5);
		scoreRestaurants.add(rest6);
		scoreRestaurants.add(rest7);
		scoreRestaurants.add(rest8);
		
		for(Restaurant rest: scoreRestaurants) {
			System.out.println(rest.toString());
		}
	}

}

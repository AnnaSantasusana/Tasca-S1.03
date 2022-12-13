package countriesHashMap;

import java.io.*;
import java.util.*;

public class App {
	
	public static void main(String[] args) {
		
		CountriesFile file = new CountriesFile();
	
		HashMap<String, String> countries = file.importFile();
		
		String name = requestName();
		
		int points = showCountry(countries); 
		
		file.createFile(name, points);
		
	}
	
	
	public static String requestName() {
		Scanner input = new Scanner(System.in);
		String name = "";
		
		System.out.println("Introduce your name");
		name = input.nextLine();
		
		return name;
	}
	
	public static int showCountry(HashMap<String, String> countries) {
		Scanner input = new Scanner(System.in);
		int points = 0;
		int i = 0;
		String capital = "";
		
		Random generator = new Random();
		Object[] country = countries.keySet().toArray();
		
		while (i < 10) {
			Object randomCountry = country[generator.nextInt(country.length)];
			System.out.println("Which is the capital of " + randomCountry + "? Introduce it:");
			capital = input.nextLine();
			
			if (capital.equalsIgnoreCase(countries.get(randomCountry))) {
				points += 1;
				
			}
			i++;
			
		}
		System.out.println("Total points = " + points);	
		return points;
	}
	
	
}

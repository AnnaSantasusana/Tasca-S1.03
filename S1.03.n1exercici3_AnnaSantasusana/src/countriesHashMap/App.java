package countriesHashMap;

import java.io.*;
import java.util.*;

public class App {
	
	public static void main(String[] args) {
		
		HashMap<String, String> countries = importFile();
		
		String name = requestName();
		
		int points = showCountry(countries); 
		
		createFile(name, points);
		
	}
	
	public static HashMap<String, String> importFile() {
		String line;
		String[] chains;
		HashMap<String, String> countries = new HashMap <String, String>();
		
		try {
			System.out.println("Reading the file...");
			FileReader fr = new FileReader("/Users/annasantasusanaberch/Desktop/It Academy -  Cibernàrium/Especialització Java/countries.txt");
			BufferedReader br = new BufferedReader(fr);
			while((line = br.readLine()) !=null) {
				chains = line.split(" ");
				countries.put(chains[0], chains[1]);
			}
			br.close();
			System.out.println("Countries imported correctly!");
		} catch (IOException e) {
			System.out.println("Failure to read the file");
			e.printStackTrace();
		}
		
		return countries;
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
			
			if (capital.equals(countries.get(randomCountry))) {
				points += 1;
				
			}
			i++;
			
		}
		System.out.println("Total points = " + points);	
		return points;
	}
	
	public static void createFile(String name, int points) {
		String content = "Name: " + name + "- Points: " + points;
		
		try {
			File classification = new File("/Users/annasantasusanaberch/Desktop/It Academy -  Cibernàrium/Especialització Java/classification.txt");
			if (!classification.exists()) {
				classification.createNewFile();
				System.out.println("File created: " + classification.getName());
			}
			FileWriter fw = new FileWriter(classification);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			System.out.println("File saved");
		} catch (Exception e) {
			System.out.println("An error ocurred");
			e.printStackTrace();
		}
	}
	
}

package countriesHashMap;

import java.io.*;
import java.util.HashMap;

public class CountriesFile {

	public HashMap<String, String> importFile() {
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
	
	public void createFile(String name, int points) {
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

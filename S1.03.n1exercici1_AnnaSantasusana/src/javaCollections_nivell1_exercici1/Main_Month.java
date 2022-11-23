package javaCollections_nivell1_exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main_Month {

	public static void main(String[] args) {
		
		//Faig un array per després afegir-lo al ArrayList
		Month[] myMonth = new Month[11];
		myMonth[0] = new Month("January");
		myMonth[1] = new Month("February");
		myMonth[2] = new Month("March");
		myMonth[3] = new Month("April");
		myMonth[4] = new Month("May");
		myMonth[5] = new Month("June");
		myMonth[6] = new Month("July");
		myMonth[7] = new Month("September");
		myMonth[8] = new Month("October");
		myMonth[9] = new Month("November");
		myMonth[10] = new Month("December");
		
		ArrayList<Month> calendar = new ArrayList<Month>(Arrays.asList(myMonth));
		
		//Introdueixo el mes d'Agost a la posició que li toca
		Month august = new Month("August");
		calendar.add(7, august);
		
		//Demostro que l'ArrayList manté l'ordre correcte
		showArrayList(calendar);
		
		System.out.println("\n");
		
		//Converteixo l'ArrayList a un HashSet
		HashSet<Month> calendarHashSet = new HashSet<>(calendar);
		
		//M'asseguro que no permet duplicats
		Month month11 = new Month("January");
		Month month12 = new Month("July");
		calendarHashSet.add(month11);
		calendarHashSet.add(month12);
		
		//Recorro la llista de dues formes diferents
		showHashSet1(calendarHashSet);
		
		System.out.println("\n");
		
		showHashSet2(calendarHashSet);
		
		
	}
	
	public static void showArrayList(ArrayList<Month> calendar) {
		for (Month m: calendar) {
			System.out.println(m.toString());
		}
	}
	
	public static void showHashSet1(HashSet<Month> calendarHashSet) {
		for(Month mo: calendarHashSet) {
			System.out.println(mo.toString());
		}
	}
	
	public static void showHashSet2(HashSet<Month> calendarHashSet) {
		Iterator<Month> iterator = calendarHashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}

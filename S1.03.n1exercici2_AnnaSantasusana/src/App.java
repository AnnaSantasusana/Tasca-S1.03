import java.util.*;

public class App {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
	
		System.out.println(list1);
		
		ListIterator<Integer> listIterator = list1.listIterator(list1.size());
		
		while(listIterator.hasPrevious()) {
			list2.add(listIterator.previous());
		}
	
		System.out.println(list2);
	}

}

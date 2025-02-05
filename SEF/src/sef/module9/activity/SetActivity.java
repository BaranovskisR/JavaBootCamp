package sef.module9.activity;

//Needs to be completed
import java.util.*;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		Set names = new HashSet();

		names.add("Rolands");
		names.add("Anna");
		names.add("John");
		names.add("Catherine");

		List nameSort = new ArrayList<String>(names);
		Collections.sort(nameSort);

		System.out.println("Sorted list : " + nameSort);

		//2 - Call print method to print the set passed as its parameter.
		print(names);
	}

	static void print(Set set) {
		//3 - Type code to print this set
		//Notice the order in which elements get printed.
		Iterator i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
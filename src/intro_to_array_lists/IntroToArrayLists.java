package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> uhHuh = new ArrayList<String>();
		//2. Add five Strings to your list
		uhHuh.add("one");
		uhHuh.add("two");
		uhHuh.add("three");
		uhHuh.add("four");
		uhHuh.add("five");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i<uhHuh.size(); i++) {
			String s = uhHuh.get(i);
			System.out.print(s);
		}
		//4. Print all the Strings using a for-each loop
		for(String l: uhHuh) {
			System.out.println(l);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i<uhHuh.size(); i++) {
			if (i/2 == 0) {
			String s = uhHuh.get(i);
			System.out.print(s);
			}
			else {
			}
			}
		
		//6. Print all the Strings in reverse order.
		for (int i = uhHuh.size() - 1; i >= 0; i--) {
			String s = uhHuh.get(i);
			System.out.println(s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i<uhHuh.size(); i++) {
		if (uhHuh.get(i).contains("e")) {
			String s = uhHuh.get(i);
			System.out.print(s);
		}else {
			
		}
		}
	
}
}

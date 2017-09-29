package intro_to_array_lists;
import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
	
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> shoppingList = new ArrayList<String>();
		//2. Add five Strings to your list
		shoppingList.add("1-eggs");
		shoppingList.add("2-milk");
		shoppingList.add("3-pickles");
		shoppingList.add("4-cat food");
		shoppingList.add("5-honey");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < shoppingList.size(); i++) {
			String s = shoppingList.get(i);
			System.out.println(s);
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String s : shoppingList) {
			System.out.println(s);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < shoppingList.size() ; i++) {
			if(i%2 != 0) {
			String s = shoppingList.get(i);
			System.out.println(s);
			}
		}
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		for(int i = shoppingList.size() -1; i >= 0; i--) {
			String s = shoppingList.get(i);
			System.out.println(s);
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < shoppingList.size(); i++) {
			String s = shoppingList.get(i);
			if(s.indexOf("e") > 0) {
			System.out.println(s);
			}
		}
		System.out.println("\n");
		}
}

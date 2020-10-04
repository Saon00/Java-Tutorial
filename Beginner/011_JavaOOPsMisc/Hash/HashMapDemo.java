package Others;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> items = new HashMap<>();

		items.put(101, "Saon");
		items.put(102, "Srabon");
		items.put(103, "Sikder");

		// to get specific item
		System.out.println("Speciifc item: " + items.get(102));

		// to get all
		System.out.println("All items: " + items);

		// clone items
		items.clone();
		System.out.println("Clone item: " + items);

		// to get keys
		for (int i : items.keySet()) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// to get values
		for (String i : items.values()) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// to get both
		for(int i : items.keySet()) {
			System.out.println("key: " + i + " value: " + items.get(i));
		}

		// remove item
		items.remove(101);
		System.out.println("Remove Speciifc item: " + items);

		// remove all
		items.clear();
		System.out.println("Remove all items: " + items);

	}

}

package array;

import java.util.*;

public class Arraylist {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>();
		System.out.println("initial size: " + number.size());

		System.out.print("How many numbers you want: ");
		int limit = scan.nextInt();

		// adding value
		for (int i = 0; i < limit; i++) {
			int n = scan.nextInt();
			number.add(n);
		}
		System.out.println("Normla output Style-------------");
		System.out.println(number);
		System.out.println("Final size: " + number.size());

		// set
		number.set(3, 10); // here 3 is index and 10 is new element
		System.out.println(number);
		// get
		System.out.println(number.get(2)); // 2 is index number

//		index of
//		int position = number.indexOf(elemnt); here element is taken number
//		System.out.println("Index: "+position);

		// it is optional. not a good use
		System.out.println("\nUsing Iteretor-----------");

		Iterator<Integer> itr = number.iterator();
		while (itr.hasNext()) { // hasNext() = joto somoy value ache toto somoy cholbe
			System.out.print(itr.next() + " "); // itr.next() value gulo print korbe
		}
		System.out.println();
		// to check array list empty or not
		boolean check = number.isEmpty();
		System.out.println("Array list is empty: " + check);

		// ArrayList Sorting
		Collections.sort(number);
		System.out.print("After sorting: " + number);
		System.out.println();
		//reverse
		Collections.sort(number,Collections.reverseOrder());
		System.out.println("Reverse Sort: "+number);
		// to check any element is available or not
		boolean available = number.contains(10); // you have to put a value instead 10
		System.out.println("Contains available : " + available);

		// removing value from list
		System.out.println();
		System.out.print("Which number you want to remove type index: ");
		int rmv_index = scan.nextInt();
		number.remove(rmv_index);
		System.out.print("New List: " + number);
		System.out.println();

		// remove all
		number.removeAll(number);
		System.out.println("After removing all numbers: " + number);
		System.out.println("Size: " + number);
		System.out.println("Happy Coding");

		// clear
//		number.clear();
//		System.out.println("After Clear: "+number);
	}

}

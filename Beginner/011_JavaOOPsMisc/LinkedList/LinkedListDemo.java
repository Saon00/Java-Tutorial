package Others;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("Saon");
		linkedList.add("Srabon");
		linkedList.add("Manus");

		System.out.println(linkedList);
		linkedList.add(3, "Roshona");
		System.out.println(linkedList);
		linkedList.addFirst("Kanta");
		System.out.println(linkedList);
		linkedList.addLast("Vat");
		System.out.println(linkedList);
		System.out.println("First: " + linkedList.getFirst());
		System.out.println("First: " + linkedList.getLast());
		System.out.println(linkedList.size());
		;

	}

}

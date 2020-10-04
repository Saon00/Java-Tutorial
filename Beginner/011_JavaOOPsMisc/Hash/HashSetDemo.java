package Others;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashSet<String> hashSet = new HashSet<>();
	
	// add elements
	hashSet.add("Saon");
	hashSet.add("Srabon");
	hashSet.add("Maimun");
	hashSet.add("Hrisa");
	hashSet.add("Saon"); // duplicate value not count
	
	
	// print elements
	for(String iString : hashSet) {
		System.out.print(iString+", ");
	}System.out.println();

	// size of Hash set
	System.out.println("Size: "+hashSet.size());
	
	
	// remove element
	hashSet.remove("Saon");
	System.out.println(hashSet);
	
	// clear all
	hashSet.clear();
	System.out.println(hashSet);
	
	}

}

package Practise;

import java.util.*;

public class StringClass{
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String nameString = "saon is a student.";
		System.out.println(nameString.toUpperCase());
		char[] ch = { 'H', 'e', 'l', 'l', 'o', '!' };
		String newstString = new String(ch);
		System.out.println(newstString.charAt(4)); // charAt();
		System.out.println("----------------------");

		// format string
		Object intvar = 10;
		Object floatVar = 10.69;
		Object stringvar = "ami ";
		String fs = String.format("I am a boy \n my age is %d . \n my fav ratio is %.2f. \n my means : %s", intvar,
				floatVar, stringvar);
		System.out.println(fs);

		// concat()
		System.out.println("----------------------");
		System.out.println(newstString.concat(" Kemon acho!"));
		System.out.println("----------------------");

		// string methods

		System.out.println(nameString.charAt(2));// charAt();
		// compareTo(Object );
		// -------------------
		// copyValueOf();
		String s2 = String.copyValueOf(ch);// copyValueOf();
		System.out.println(s2);
		System.out.println("----------------------");
		// endsWith();
		boolean endmatch;
		endmatch = nameString.endsWith("student.");
		System.out.println("endmatch is : " + endmatch);
		endmatch = nameString.endsWith("Student.");
		System.out.println("endmatch is : " + endmatch);
		System.out.println("----------------------");
		// equalsIgnoreCase();
		String str = new String("SAON IS A STUDENT.");
		boolean casechk;
		casechk = str.equalsIgnoreCase(nameString);
		System.out.println("Equals Ignore Check: " + casechk);
		System.out.println("----------------------");
		// hashCode();
		String saonString = "jfh&hja$";
		System.out.println("Hash Code = " + saonString.hashCode());
		System.out.println("----------------------");
		// indexof(ch);
		System.out.println("Index of : " + saonString.indexOf('h'));
		System.out.println("----------------------");
		// indexof(str);
		String str1 = "My name is Saon";
		String sr2 = "Saon";
		System.out.println("Found indexof string: " + str1.indexOf(sr2));
		System.out.println("----------------------");
		// intern();
		System.out.println("Intern method : " + str1.intern());
		System.out.println("----------------------");
		// lastIndexOf(ch);
		String lastindex1 = "Visit my channel BlackOsra";
		System.out.println("Last Index of: " + lastindex1.lastIndexOf('s'));
		// lastIndexOf(str); it can be occurred in string too
		System.out.println("----------------------");
		// length();
		// matches();
		String match1 = "Go home Buddy! Welcome";
		System.out.println("Matches : " + match1.matches("(.*)home(.*)"));
		System.out.println("Matches : " + match1.matches("(.*)Buddy"));
		System.out.println("Matches : " + match1.matches("(.*)Welcome(.*)"));
//		Scanner input1=new Scanner(System.in);
//		System.out.println("Type a sentence below: ");
//		String str1=input1.nextLine();
//		System.out.println("Which part you want to match write that: ");
//		String str2=input1.nextLine();
//		
//		boolean chk;
//		chk=str1.matches("(.*)"+str2+"(.*)");
//		if(chk==true) {
//			System.out.println("You win!!!!");
//		}
//		else {
//			System.out.println("Try next time :( ");
//		}
		System.out.println("----------------------");
		// replace();
		System.out.println("Before Replace: " + match1);
		System.out.println("After Raplace o to y: " + match1.replace('o', 'y'));
		// replaceAll();
//		String str1="Go Home First , We Will Meet Soon.";
//		String str2="stay";
//		System.out.println("Change : "+str1.replaceAll("First",str2));
		System.out.println("----------------------");
		// replaceFirst();
		System.out.println(match1.replaceFirst("o", "u"));
		System.out.println("----------------------");
		// split();
		String splithString = "Ship- shipping- Ship- is- shipping- shipshipping- ship.";
		for (String change1 : splithString.split("-")) { // change1:splitString
			System.out.print(change1);
		}
		System.out.println("----------------------");
		// trim(); remove blank spaces
		String blank = "  Hi, my name is Saon. ";
		System.out.println(blank.trim());
		System.out.println("----------------------");
		System.out.println("----------------------");

	}

}

package OOP;

import java.util.*;

public class TestClass {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher teacher = new Teacher();

		System.out.print("Enter Your Name: ");
		String nameString = scan.nextLine();
		teacher.name = nameString;

		System.out.print("Enter Your Age: ");
		int ageString = scan.nextInt();
		scan.nextLine(); // using this help to don't skip
		teacher.age = ageString;

		System.out.print("Enter Your Gender: ");
		String genderString = scan.nextLine();
		teacher.gender = genderString;

		System.out.print("Enter Your E-mail: ");
		String emailString = scan.nextLine();
		teacher.email = emailString;

		System.out.print("Enter Your Phone Number: ");
		int phonenumberst = scan.nextInt();
		teacher.phonenumber = phonenumberst;

		System.out.println();
		teacher.show();

	}

}

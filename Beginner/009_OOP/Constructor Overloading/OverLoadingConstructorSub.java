package OOP;

public class OverLoadingConstructorSub {

	String name, gender;
	int age;

	OverLoadingConstructorSub() {
		System.out.println("OverLoading Constructor ");
	}

	OverLoadingConstructorSub(String n1, int a1, String g1) {

		name = n1;
		age = a1;
		gender = g1;

	}

	OverLoadingConstructorSub(String n2, int a2) {

		name = n2;
		age = a2;

	}

	void show() {

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
	}
}

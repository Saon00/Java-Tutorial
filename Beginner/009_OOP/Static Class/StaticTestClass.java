package OOP;

public class StaticTestClass {
	
	String student_name; // instance variable	
	int student_id;	// instance variable
	static String university_name="FEC"; // static variable
	
	
	void show() {
		System.out.println("Student name: "+student_name);
		System.out.println("Student name: "+student_id);
		System.out.println("Student name: "+university_name);
	}
	
	// you can write static variable direct
	static String saonString = "Saon Sikder";
	
	// you can write static method direct
	static void display() {
		System.out.println("This is a static method");
	}
	
}

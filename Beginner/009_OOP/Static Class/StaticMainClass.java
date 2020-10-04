package OOP;

public class StaticMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticTestClass staticTestClass = new StaticTestClass();
		
		staticTestClass.student_name = "Saon Sikder";
		staticTestClass.student_id = 23;
		staticTestClass.show();
		
		System.out.println();
		staticTestClass.student_name = "Srabon";
		staticTestClass.student_id = 34;
		staticTestClass.show();
		System.out.println();
		
		// i don't need to create an object to print saonstring
		System.out.println("Saon: "+StaticTestClass.saonString);
		// bcz, static depends on Class, not object
		
		StaticTestClass.display();
	}

}

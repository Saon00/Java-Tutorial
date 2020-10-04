package OOP;

public class ParameterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParameterTest parameterTest = new ParameterTest();
		int vv = parameterTest.add(10, 20);
		System.out.println("Sum of 10 & 20: "+vv);

		int vvv = parameterTest.add(100, 1);
		System.out.println("Sum of 100 & 1: "+vvv);

		// using Constructor

//		ParameterTest parameterTest = new ParameterTest("Saon",22);
//		parameterTest.display();

	}

}

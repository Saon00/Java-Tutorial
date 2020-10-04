
public class StringtoPrimitive{

	public static void main(String[] args) {

		// string to primitive

		String string = "100";
		int i = Integer.parseInt(string); // converted
		// or
		int k = Integer.valueOf(string); // easy way
		System.out.println(i);
		System.out.println(k);

		// Primitive to String

		int j = 10;
		String string2 = Integer.toString(j);
		System.out.println(string2);

	}

}

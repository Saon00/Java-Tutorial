
public class WrappingClass {

	public static void main(String[] args) {

		// Auto Boxing
		int x = 10;
		Integer x1 = Integer.valueOf(x); // or
		Integer x2 = x; // Integer.valueOf(x);
		System.out.println("AutoBoxing: " + x1 + " and " + x2);

		// Unboxing
		Integer y = 10;
		y = y + 5;
		System.out.println(y);
		// or
		Double db = new Double(10.25);

		double undb = db.doubleValue(); // or
		double undbdb = db; // db.doubleValue();
		System.out.println("Unboxed: " + undb);
		System.out.println("Unboxed: " + undbdb);

	}

}

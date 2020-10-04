import java.awt.Point;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) {

		int age = 10;
		Date date = new Date();
		// date - instance / object
		// new - to allocate memories
		System.out.println(date);
		
		Point point1 = new Point(1,1);
		Point point2 = point1;
		point1.x=2;
		System.out.println(point2);
		
		/* point1 or point2 they are reference variable.
		 * they do not store actual value. 
		 */
		
	}

}

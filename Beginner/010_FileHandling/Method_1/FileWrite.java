
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fW = new FileWriter("C:\\Users\\saons\\Desktop\\badhon.txt");

		for (int i = 0; i < 3; i++) {
			String country = input.nextLine();
			String city = input.nextLine();
			String forString = String.format("%s : %s\n", country, city);
			fW.write(forString);
		}
// for single line -- alternative way.		
//		String name = input.nextLine();
//		for(int i=0;i<name.length();i++) {
//			fW.write(name.charAt(i));
//		}


		System.out.println("Successful");
		fW.close();

	}

}

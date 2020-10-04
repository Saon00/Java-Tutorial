package File;

import java.io.File;
import java.util.Scanner;

public class FileReadClass {

	public static void main(String[] args) {

		try {
			File file = new File("C:\\Users\\saons\\Desktop\\Example\\saon.txt");
			Scanner scanner = new Scanner(file);
		
			while(scanner.hasNext()) {
				System.out.print(scanner.next());
				System.out.println();
			}
			
		scanner.close();
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}

	}

}

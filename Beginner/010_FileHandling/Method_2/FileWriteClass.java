package File;

import java.util.Formatter;
import java.util.Scanner;

public class FileWriteClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int id;
		String name;

		try {
			Formatter formatter = new Formatter("C:\\Users\\saons\\Desktop\\Example\\saon.txt");

			System.out.print("How many students: ");
			int num = scanner.nextInt();

			for (int i = 1; i <= num; i++) {
				id = scanner.nextInt();
				scanner.nextLine();
				name = scanner.nextLine(); // important line, try this code without using this to know why
				formatter.format("%d %s\n", id, name);
			}

//			formatter.format("%d %s\n",101,"Saon" );
//			formatter.format("%d %s\n",102,"Sikder" );
//			formatter.format("%d %s\n",103,"Srabon" );
			formatter.close();

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

}

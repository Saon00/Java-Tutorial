package youtubeTutorials;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Name of Stock Keeper: ");
		String stockKeepnerName = scanner.nextLine();
		System.out.print("Enter Album Name: ");
		String albumName = scanner.nextLine();
		System.out.print("Enter Artist Name: ");
		String artistName = scanner.nextLine();
//		scanner.nextLine();
		System.out.print("Enter the Price: ");
		Double albumPrice = scanner.nextDouble();
		System.out.print("Enter the Copies Number: ");
		int copiesNumber = scanner.nextInt();
		System.out.println("----------------------");
		System.out.println("----------------------");
		StockKeeper stockKeeper = new StockKeeper(stockKeepnerName);

		stockKeeper.manageAlbum(new Albums(), albumName, artistName, albumPrice, copiesNumber);
		
	}

}

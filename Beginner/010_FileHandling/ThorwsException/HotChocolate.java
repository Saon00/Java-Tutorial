package Udemy;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

	public static final double tooHot = 185;
	public static final double toocold = 160;

	public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException {
		if (cocoaTemp >= tooHot) {
			throw new TooHotException();
		} else if (cocoaTemp <= toocold) {
			throw new TooColdException();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		double currentCocoaTemp = 150;
		boolean wrongTemp = true;
		while (wrongTemp) {
			try {
				drinkHotChocolate(currentCocoaTemp);
				System.out.println("Chocolate Temperature is Good!!!!");
				wrongTemp = false;
			} catch (TooHotException e1) {
				System.out.println("That's too HOT!!!");
				currentCocoaTemp = currentCocoaTemp - 5;
			} catch (TooColdException e2) {
				System.out.println("That's too COLD!!!");
				currentCocoaTemp = currentCocoaTemp + 5;
			}
			// to slower the time
			TimeUnit.SECONDS.sleep(2);
		}

		System.out.println("Ok, it's ready to Drink..");
	}

}

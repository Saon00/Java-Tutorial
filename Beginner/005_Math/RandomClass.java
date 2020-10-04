import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {

		Random random = new Random();
		System.out.println(random.nextInt(10)+1); // 1 to 10
		
		int number = (int) (Math.random()*100)+1; // 1 to 100 
		System.out.println(number);
		
		double randNumber = Math.round(Math.random()*10); // 0 to 10
		System.out.println(randNumber);

		// not a good way
		double randomNumber = Math.ceil(Math.random()*10);
		System.out.println(randomNumber);
	}

}

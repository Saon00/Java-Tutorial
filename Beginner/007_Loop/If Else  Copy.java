
public class MainClass {

	public static void main(String[] args) {

		int income = 120_000;
		
		// usual way we code
		if(income>100_000)
			System.out.println("Rich Man");
		else
			System.out.println("Poor Man");
		
		// but we can simplify this code
		boolean isRich = income > 100_000;
		System.out.println("is Rich: "+isRich);
		
	}

}

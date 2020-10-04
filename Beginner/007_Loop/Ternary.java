
public class MainClass {

	public static void main(String[] args) {

		int income = 120_000;
		
		String divisionName;
		if(income > 100_000)
			divisionName = "First Class";
		else
			divisionName = "Common Class";
		System.out.println(divisionName);
		
		// using ternary 
		
		divisionName = income > 100_000 ? "First Class" : "Common Class";
		System.out.println(divisionName);
		
	}

}

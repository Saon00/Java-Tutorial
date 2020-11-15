import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberFormatting{

	public static void main(String[] args) {

		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result = currency.format(76543218.834);
		System.out.println(result);

		NumberFormat percent = NumberFormat.getPercentInstance();
		String percentResult = percent.format(.1);
		System.out.println(percentResult);

		// we can do this with chaining Multiple method
		String finalResult = NumberFormat.getPercentInstance().format(.2);
		System.out.println(finalResult);

		float number = 83.34837f;
		System.out.printf("%.3f\n", number);

		/*
		 * import java.text.DecimalFormat; 
		 * You can use ("0.00") or ("#.##") for
		 * formating DecimalFormat obj = new DecimalFormat("0.0");
		 */
		DecimalFormat decimalFormat = new DecimalFormat("#.#");
		System.out.println(decimalFormat.format(number));
		

	}

}

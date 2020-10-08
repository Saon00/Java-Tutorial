
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {

	public static void main(String[] args) {
		
		// way: 1
		
		Pattern pattern = Pattern.compile(".a"); 
		/* here (.a) means first character can be 
		 * whatever but second letter should be 'a' to be true.
		 * and the word will contains two character to be ture. 
		 */
		Matcher matcher = pattern.matcher("sa");
		/* here 'sa' is a word which needed 
		 * to be matched with pattern
		 */
		boolean b = matcher.matches();
		System.out.println(b);
		
		// way: 2
		
		boolean b2 = Pattern.compile("..e").matcher("knife").matches();
		System.out.println(b2);
		
		// way: 3
		
		boolean b3 = Pattern.matches("...n", "lion");
		System.out.println(b3);
		
	}

}

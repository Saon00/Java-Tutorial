
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexExample3 {

	public static void main(String[] args) {
		
		
		System.out.println(Pattern.matches("[MS][a-z]{5}", "Srabon"));
		System.out.println(Pattern.matches("[MS][a-z]{5}", "Maimun"));
		System.out.println(Pattern.matches("[MS][a-z]{5}", "Saon"));
		System.out.println();
		
		// x occurs once or not at all ( Quantifier )
		System.out.println(Pattern.matches("[xyz]?", "x"));
		System.out.println(Pattern.matches("[xyz]?", "xxyy"));
		System.out.println(Pattern.matches("[xyz]?", "y"));
		System.out.println();
		
		// x occurs once or more times ( Quantifier )
		System.out.println(Pattern.matches("[xyz]+", "x"));
		System.out.println(Pattern.matches("[xyz]+", "xyyzz"));
		System.out.println();
		
		// x occurs zero or more times ( Quantifier )
		System.out.println(Pattern.matches("[xyz]*", "xyyyza"));
		System.out.println(Pattern.matches("[xyz]*", "xxyyz"));
		System.out.println();
		
		// if the character sequence consists any digit or not ( matacharacters )
		System.out.println(Pattern.matches("\\d", "3"));
		System.out.println(Pattern.matches("\\d", "2a"));
		System.out.println();

		// if the character sequence consists any Characters or not ( matacharacters )
		System.out.println(Pattern.matches("\\D", "3f"));
		System.out.println(Pattern.matches("\\D", "j"));
		System.out.println();

		// to match length of characters
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "srabon"));
		System.out.println(Pattern.matches("[a-zA-R0-9]{4}", "Saon"));
		System.out.println();
		
				
	}

}

// output
/*
true
true
false

true
false
true

true
true

false
true

true
false

false
true

true
false
*/


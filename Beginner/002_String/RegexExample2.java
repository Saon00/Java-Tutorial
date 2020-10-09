
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexExample2 {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[amn]", "m"));	
		/* [abc] should have in input only one time
		 * [abc],"a"= true
		 * [abc],"am"= false
		 */
		System.out.println(Pattern.matches("[amn]", "acd"));	
		System.out.println(Pattern.matches("[^amn]", "j"));
		// any character without a/m/n = true
		System.out.println(Pattern.matches("[a-zA-S]", "b"));
		// any character with range of a to z & A to S
		System.out.println(Pattern.matches("[a-ds-u]", "t"));
	}

}
// output
/*
true
false
true
true
true
*/

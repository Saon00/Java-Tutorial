import java.util.ArrayList;
import java.util.List;

public class EmailValidation {

	public static void main(String[] args) {

		List<String> emailList = new ArrayList<>();
    
		emailList.add("joshbutler@gmail.com");
		emailList.add("crissgayle@gmail.com");
		emailList.add("chris.nolan@hotmail.com");
		emailList.add("@gmail.com");
		emailList.add("joshbutler@gmail.com");
		emailList.add("joshbutler@com");

		for (String s : emailList)
			System.out.println("Is " + s + " a valid Email? : " + (isValid(s) == true ? "Yes" : "No"));
	}

	public static boolean isValid(String emailList) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return emailList.matches(regex);
	}
}

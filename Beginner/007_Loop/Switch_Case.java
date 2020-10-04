
public class MainClass {

	public static void main(String[] args) {

		String role = "admin";

		if (role == "admin")
			System.out.println("admin");
		else if (role == "moderator")
			System.out.println("moderator");
		else
			System.out.println("member");

		// switch case
		switch (role) {
		case "admin":
			System.out.println("admin");
			break;
		case "moderator":
			System.out.println("moderator");
			break;
		default:
			System.out.println("member");
			break;
		}

	}

}

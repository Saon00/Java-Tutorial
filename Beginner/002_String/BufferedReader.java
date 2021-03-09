import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader(
  public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Name: ");
		String name = bf.readLine();
		System.out.print("Department: ");
		String dept = bf.readLine();
		System.out.print("Roll: ");
		int roll = bf.read();
		
		System.out.printf("Your name is: %s\n"
				+ "Your Department is: %s\n"
				+ "Your Roll is: %d", name, dept, roll);
	}
)

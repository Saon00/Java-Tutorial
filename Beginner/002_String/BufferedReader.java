import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader {

    public static void main(String[] args) throws IOException {

        /*  You can use both of these way
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your Name: ");
        String name = bufferedReader.readLine();
        System.out.print("Enter your Age: ");
        int age = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Enter your Country: ");
        String countryName = bufferedReader.readLine();

        System.out.println("Your Name is: " + name +
                "\nYour Age is: " + age +
                "\nYour Country is: " + countryName);


    }
}
/*	Output:
Your Name is: Srabon
Your Age is: 22
Your Country is: Bangladesh
*/


	
	

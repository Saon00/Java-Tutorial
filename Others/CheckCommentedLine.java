import java.util.Scanner;

public class CheckCommentedLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the line: ");
        String line = scanner.nextLine();

        char[] chararray = line.toCharArray();

        if (chararray[0] == '/') {
            if (chararray[1] == '/') {
                System.out.println("This is a single line comment");
                return;
            } else if (chararray[1] == '*') {
                if (chararray[chararray.length - 2] == '*' && chararray[chararray.length - 1] == '/') {
                    System.out.println("This is a multiple line comment");
                    return;
                }
                System.out.println("This is not a Commented line");
                return;
            }
            System.out.println("This is not a Commented line");
        } else {
            System.out.println("This is not a Commented line");
        }
    }
}

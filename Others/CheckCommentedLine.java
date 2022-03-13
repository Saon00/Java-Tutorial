import java.util.Scanner;

public class CheckCommentedLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String line = "// Saon Sikder";
        String line = "/* Saon Sikder */";

        char[] charray = line.toCharArray();

        if (charray[0] == '/') {
            if (charray[1] == '/') {
                System.out.println("This is a single line Comment");
                return;
            } else if (charray[1] == '*') {
                if (charray[charray.length - 2] == '*' && charray[charray.length - 1] == '/') {
                    System.out.println("This is a Multiple line Comment");
                    return;
                }
            }
        } else {
            System.out.println("This is not a commented line");

        }

    }
}

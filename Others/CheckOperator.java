import java.util.HashMap;
import java.util.Scanner;

public class CheckOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        HashMap<String, String> map = new HashMap<>();

        // Arithmetic Operator
        map.put("+", "Plus Operator");
        map.put("-", "Minus Operator");
        map.put("*", "Multiply Operator");
        map.put("/", "Divide Operator");
        map.put("%", "Modulas Operator");

        // Logical Operator
        map.put("||", "Logical OR Operator");
        map.put("&&", "Logical AND Operator");
        map.put("!", "Logical NOT Operator");

        // Assignment Operator
        map.put("==", "Equal Operator");
        map.put("<", "Less than Operator");
        map.put(">", "Greater than Operator");
        map.put("=>", "Greater than Equal Operator");
        map.put("<=", "Less than Equal Operator");
        map.put("!=", "Not Equal Operator");

        // Relational Operator
        map.put("=", "Assign Assignment Operator");
        map.put("+=", "Add AND Assignment Operator");
        map.put("-=", "Subtract AND Assignment Operator");
        map.put("*=", "Multiply AND Assignment Operator");
        map.put("/=", "Divide AND Assignment Operator");
        map.put("%=", "Modulas AND Assignment Operator");
        map.put("++", "Increment Operator");
        map.put("--", "Decrement Operator");

        // Bitwise Operator
        map.put("|", "Bitwise OR Operator");
        map.put("&", "Bitwise AND Operator");
        map.put("<<", "Binary Left Shift Operator");
        map.put(">>", "Binary Right Shift Operator");
        map.put("^", "Binary XOR Operator");
        map.put("~", "Binary One's Complement Operator");

        if (map.get(line) != null) {
            System.out.println(map.get(line));
        } else {
            System.out.println("NO");
        }

    }
}

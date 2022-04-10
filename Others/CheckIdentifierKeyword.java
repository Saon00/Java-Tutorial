package sixth.semester;

import java.util.Scanner;
public class CheckIdentifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Line: ");
        String line = scanner.nextLine();
        if (isValid(line) == 1) {
            System.out.println(line + " is a KEYWORD");
        } else if (isValid(line) == 0) {
            System.out.println(line + "is an Identifier");
        } else {
            System.out.println(line + " is neither Keyword or Identifier");
        }
    }

    static int isValid(String string) {

        String[] keywordArray = {"auto", "double", "int", "struct", "break", "else", "long",
                "switch", "case", "enum", "register", "typedef", "char",
                "extern", "return", "union", "const", "float", "short",
                "unsigned", "continue", "for", "signed", "void", "default",
                "goto", "sizeof", "super", "do", "if", "static", "while"
        };

        int count = 0;

        for (int i = 0; i < keywordArray.length; i++) {
            if (keywordArray[i].equals(string))
                return count = 1;
        }

        if (!((string.charAt(0) >= 'a' && string.charAt(0) <= 'z') ||
                (string.charAt(0) >= 'A' && string.charAt(0) <= 'Z') ||
                (string.charAt(0) == '$') ||
                (string.charAt(0) == '_')))
            return count = 2;

        for (int i = 1; i < string.length(); i++) {
            if (!((string.charAt(i) >= 'a' && string.charAt(i) <= 'z') ||
                    (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') ||
                    (string.charAt(i) >= '0' && string.charAt(i) <= '9') ||
                    (string.charAt(i) == '$') ||
                    (string.charAt(i) == '_')))
                return count = 2;
        }
        return count = 0;
    }
}

package String;

public class NumberConversation {

	public static void main(String[] args) {
		
		String binaryString = "1010";
		int decimal = Integer.parseInt(binaryString, 2);
		System.out.println("Binary to Decimal: "+decimal);
		
		String octalString = "2364";
		int decimal2 = Integer.parseInt(octalString, 8);
		System.out.println("Octal to Decimal: "+decimal2);

		String hexadecimalString = "a";
		int decimal3 = Integer.parseInt(hexadecimalString, 16);
		System.out.println("Hexadecimal to Decimal: "+decimal3);
		System.out.println("\n");
		
		int decimal4 = 10;
		String binaryString2 = Integer.toBinaryString(decimal4);
		System.out.println("Decimal to Binary: "+binaryString2);
		
		int decimal5 = 1268;
		String octalString2 = Integer.toOctalString(decimal5);
		System.out.println("Decimal to Octal: "+octalString2);
		
		int decmal6 = 10;
		String hexadecimalString2 = Integer.toHexString(decmal6);
		System.out.println("Decimal to HexaDecimal: "+hexadecimalString2);
	}

}

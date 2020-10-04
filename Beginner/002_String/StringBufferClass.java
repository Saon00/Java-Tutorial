package String;

import java.util.Scanner;

public class StringBufferClass {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		String s1 = new String("Saon ");
		StringBuffer stringBuffer = new StringBuffer(s1);
		
		stringBuffer.append("is ");
		stringBuffer.append("22 ");
		stringBuffer.append("years ");
		stringBuffer.append("old");
		System.out.println(stringBuffer);
		stringBuffer.reverse();
		System.out.println(stringBuffer);
		stringBuffer.delete(0, 8);
		System.out.println(stringBuffer);
	}
}

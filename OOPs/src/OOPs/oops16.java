package OOPs;

import java.util.Scanner;

public class oops16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String a = sc.nextLine();

		System.out.print("Enter second string: ");
		String b = sc.nextLine();

		String result = mixStrings(a, b);
		System.out.println("Result: " + result);

		sc.close();
	}

	public static String mixStrings(String a, String b) {
		StringBuilder result = new StringBuilder();
		int len = Math.max(a.length(), b.length());

		for (int i = 0; i < len; i++) {
			if (i < a.length()) {
				result.append(a.charAt(i));
			}
			if (i < b.length()) {
				result.append(b.charAt(i));
			}
		}
		return result.toString();
	}
}

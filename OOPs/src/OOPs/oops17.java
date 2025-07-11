package OOPs;

import java.util.Scanner;

public class oops17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		System.out.print("Enter an integer n (0 to length of string): ");
		int n = sc.nextInt();

		String result = repeatLastN(input, n);
		System.out.println("Result: " + result);

		sc.close();
	}

	public static String repeatLastN(String str, int n) {
		String part = str.substring(str.length() - n);
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < n; i++) {
			result.append(part);
		}
		return result.toString();
	}
}

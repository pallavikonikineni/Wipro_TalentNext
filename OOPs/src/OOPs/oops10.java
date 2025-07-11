package OOPs;

import java.util.Scanner;

public class oops10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		String result = repeatPrefix(input);
		System.out.println("Result: " + result);

		sc.close();
	}

	public static String repeatPrefix(String str) {
		int n = str.length();
		String prefix = str.length() < 2 ? str : str.substring(0, 2);
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < n; i++) {
			result.append(prefix);
		}
		return result.toString();
	}
}

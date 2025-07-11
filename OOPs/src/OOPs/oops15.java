package OOPs;

import java.util.Scanner;

public class oops15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string (with * in it): ");
		String input = sc.nextLine();

		String result = removeStarAndAdjacent(input);
		System.out.println("Result: " + result);

		sc.close();
	}

	public static String removeStarAndAdjacent(String str) {
		StringBuilder result = new StringBuilder();
		int len = str.length();

		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == '*'
					|| (i > 0 && str.charAt(i - 1) == '*')
					|| (i < len - 1 && str.charAt(i + 1) == '*')) {
				continue;
			}
			result.append(str.charAt(i));
		}

		return result.toString();
	}
}

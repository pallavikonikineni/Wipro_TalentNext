package OOPs;

import java.util.Scanner;

public class oops12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		String result = removeFirstAndLast(input);
		System.out.println("Result: " + result);

		sc.close();
	}

	public static String removeFirstAndLast(String str) {
		if (str.length() <= 2) {
			return "";
		}
		return str.substring(1, str.length() - 1);
	}
}

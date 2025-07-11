package OOPs;

import java.util.Scanner;

public class oops14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		
		String result = removeX(input);
		System.out.println("Result: " + result);
		
		sc.close();
	}

	public static String removeX(String str) {
		int start = 0;
		int end = str.length();

		if (str.length() > 0 && str.charAt(0) == 'x') {
			start = 1;
		}
		if (str.length() > 1 && str.charAt(str.length() - 1) == 'x') {
			end = end - 1;
		}
		return str.substring(start, end);
	}
}

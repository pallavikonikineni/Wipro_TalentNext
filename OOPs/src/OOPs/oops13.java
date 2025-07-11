package OOPs;

import java.util.Scanner;

public class oops13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String a = sc.nextLine();
		
		System.out.print("Enter second string: ");
		String b = sc.nextLine();
		
		String result = combineShortLongShort(a, b);
		System.out.println("Result: " + result);
		
		sc.close();
	}

	public static String combineShortLongShort(String a, String b) {
		if (a.length() < b.length()) {
			return a + b + a;
		} else {
			return b + a + b;
		}
	}
}

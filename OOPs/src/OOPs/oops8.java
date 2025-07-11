package OOPs;

import java.util.Scanner;

public class oops8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		if (isPalindrome(str)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
		
		sc.close();
	}

	public static boolean isPalindrome(String str) {
		str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
		int left = 0, right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}

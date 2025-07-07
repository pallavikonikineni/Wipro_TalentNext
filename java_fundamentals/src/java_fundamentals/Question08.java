package java_fundamentals;
import java.util.Scanner;
public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a single character: ");
		char ch = scanner.next().charAt(0);
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			System.out.println("Alphabet");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("Digit");
		} else {
			System.out.println("Special Character");
		}
		scanner.close();
	}
}

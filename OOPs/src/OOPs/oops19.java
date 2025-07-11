package OOPs;

import java.util.Scanner;
import java.util.StringJoiner;

public class oops19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of cities for s1: ");
		int n1 = sc.nextInt();
		sc.nextLine(); 
		StringJoiner s1 = new StringJoiner("-");
		for (int i = 0; i < n1; i++) {
			System.out.print("Enter city " + (i + 1) + " for s1: ");
			s1.add(sc.nextLine());
		}
		System.out.print("Enter number of cities for s2: ");
		int n2 = sc.nextInt();
		sc.nextLine();
		StringJoiner s2 = new StringJoiner("-");
		for (int i = 0; i < n2; i++) {
			System.out.print("Enter city " + (i + 1) + " for s2: ");
			s2.add(sc.nextLine());
		}
		StringJoiner merge1 = new StringJoiner("-");
		merge1.merge(s1);
		merge1.merge(s2);
		System.out.println("\n(i) s1 merged to s2: " + merge1.toString());
		StringJoiner merge2 = new StringJoiner("-");
		merge2.merge(s2);
		merge2.merge(s1);
		System.out.println("(ii) s2 merged to s1: " + merge2.toString());

		sc.close();
	}
}

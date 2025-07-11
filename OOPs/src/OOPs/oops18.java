package OOPs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class oops18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of names: ");
		int n = sc.nextInt();
		sc.nextLine(); 
		ArrayList<String> names = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter name " + (i + 1) + ": ");
			names.add(sc.nextLine());
		}
		StringJoiner joiner = new StringJoiner(", ", "{", "}");
		for (String name : names) {
			joiner.add(name);
		}
		System.out.println("Formatted names: " + joiner.toString());
		sc.close();
	}
}

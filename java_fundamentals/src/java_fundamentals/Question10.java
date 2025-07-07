package java_fundamentals;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet character: ");
        char ch = scanner.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z')) {
            char upper = Character.toUpperCase(ch);
            System.out.println(ch + " -> " + upper);
        } else if ((ch >= 'A' && ch <= 'Z')) {
            char lower = Character.toLowerCase(ch);
            System.out.println(ch + " -> " + lower);
        } else {
            System.out.println("Invalid input. Please enter an alphabet character.");
        }

        scanner.close();
    }
}

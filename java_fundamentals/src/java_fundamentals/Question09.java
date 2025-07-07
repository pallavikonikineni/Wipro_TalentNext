package java_fundamentals;

import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter gender (Male/Female): ");
        String gender = scanner.nextLine().trim();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age < 1 || age > 100) {
            System.out.println("Error: Age must be between 1 and 100.");
        } else if (gender.equalsIgnoreCase("Female")) {
            if (age <= 58) {
                System.out.println("Interest rate: 8.2%");
            } else {
                System.out.println("Interest rate: 9.2%");
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age <= 58) {
                System.out.println("Interest rate: 8.4%");
            } else {
                System.out.println("Interest rate: 10.5%");
            }
        } else {
            System.out.println("Error: Gender must be 'Male' or 'Female'.");
        }

        scanner.close();
    }
}

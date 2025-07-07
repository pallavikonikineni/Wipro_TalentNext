package java_fundamentals;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a color code (R, B, G, O, Y, W): ");
        char code = scanner.next().toUpperCase().charAt(0); 

        switch (code) {
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");
        }

        scanner.close();
    }
}

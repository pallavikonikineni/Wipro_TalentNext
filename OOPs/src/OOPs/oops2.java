package OOPs;

import java.util.Scanner;

public class oops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two integers (num1 and num2) for powerInt: ");
		int intNum1 = sc.nextInt();
		int intNum2 = sc.nextInt();
		System.out.println("Result of powerInt: " + Calculator.powerInt(intNum1, intNum2));
		
		System.out.print("Enter a double and an integer (num1 and num2) for powerDouble: ");
		double doubleNum1 = sc.nextDouble();
		int intNum3 = sc.nextInt();
		System.out.println("Result of powerDouble: " + Calculator.powerDouble(doubleNum1, intNum3));
		
		sc.close();
	}
}

class Calculator {
	public static int powerInt(int num1, int num2) {
		return (int)Math.pow(num1, num2);
	}
	
	public static double powerDouble(double num1, int num2) {
		return Math.pow(num1, num2);
	}
}

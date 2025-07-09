package java_fundamentals;
import java.util.Scanner;
public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] asciiValues = new int[n];
        for (int i = 0; i < n; i++) {
            asciiValues[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print((char) asciiValues[i]);
        }
        sc.close();
    }
}

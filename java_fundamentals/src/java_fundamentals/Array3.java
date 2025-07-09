package java_fundamentals;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == p) {
                System.out.println(i);
                sc.close();
                return;
            }
        }
        System.out.println(-1);
        sc.close();
    }
}


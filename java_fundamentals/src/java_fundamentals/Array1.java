package java_fundamentals;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        int average = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();  
            sum += a[i];         
        }
        System.out.println(sum);
        average = sum / n;
        System.out.println(average);
        
        sc.close();
    }
}


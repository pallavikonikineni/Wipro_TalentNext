package java_fundamentals;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < n; i++) {
		    a[i] = sc.nextInt();
		}

		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}if(a[i]<min) {
				min=a[i];
				
			}
		}
		System.out.println(min);
		System.out.println(max);
		sc.close();

	}

}

package java_fundamentals;
import java.util.Scanner;
import java.util.Arrays;
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0]+ " " + a[1]);
		System.out.println(a[n-1]+ " " + a[n-2]);
		sc.close();
	}

}

package java_fundamentals;
import java.util.Scanner;
import java.util.Arrays;
public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}

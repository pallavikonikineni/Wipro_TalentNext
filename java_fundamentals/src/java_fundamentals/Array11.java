package java_fundamentals;
import java.util.*;
public class Array11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		boolean flag=true;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			if(a[i]!=1&&a[i]!=4)flag=false;
		}
		System.out.println(flag);
		sc.close();
	}
}

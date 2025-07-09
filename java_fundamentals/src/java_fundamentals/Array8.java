package java_fundamentals;
import java.util.*;
public class Array8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		int sum=0;boolean skip=false;
		for(int i=0;i<n;i++){
			if(a[i]==6)skip=true;
			if(!skip)sum+=a[i];
			if(skip&&a[i]==7)skip=false;
		}
		System.out.println(sum);
		sc.close();
	}
}

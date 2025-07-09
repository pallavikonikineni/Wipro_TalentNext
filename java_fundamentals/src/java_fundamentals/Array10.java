package java_fundamentals;
import java.util.*;
public class Array10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		int[]res=new int[n];int idx=0;
		for(int i=0;i<n;i++)if(a[i]%2==0)res[idx++]=a[i];
		for(int i=0;i<n;i++)if(a[i]%2!=0)res[idx++]=a[i];
		for(int i=0;i<n;i++)System.out.print(res[i]+" ");
		sc.close();
	}
}
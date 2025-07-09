package java_fundamentals;
import java.util.*;
public class Array7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		LinkedHashSet<Integer>set=new LinkedHashSet<>();
		for(int i=0;i<n;i++)set.add(a[i]);
		for(int x:set)System.out.print(x+" ");
		sc.close();
	}
}

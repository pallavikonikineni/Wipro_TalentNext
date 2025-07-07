package java_fundamentals;
import java.util.*;
public class Question05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1 value");
		int n1=sc.nextInt();
		System.out.println("Enter n2 value");
		int n2=sc.nextInt();
		int a=n1%10;
		int b=n2%10;
		if(a==b) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		sc.close();
		
	}

}
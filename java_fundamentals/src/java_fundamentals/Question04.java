package java_fundamentals;
import java.util.*;

public class Question04 {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("positive");
		}else if(n<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}
		sc.close();
		}

}
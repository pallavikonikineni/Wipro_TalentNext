package java_fundamentals;
import java.util.Scanner;
public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}
		sc.close();

	}

}

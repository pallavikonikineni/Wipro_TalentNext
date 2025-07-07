package java_fundamentals;
import java.util.Scanner;
public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		while(a>0) {
			int digit=a%10;
			System.out.print(digit);
			a=a/10;
		}
		
		sc.close();

	}

}

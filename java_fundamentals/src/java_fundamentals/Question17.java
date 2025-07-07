package java_fundamentals;
import java.util.Scanner;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		int digit;
		while(a>0) {
			digit=a%10;
			count=count+digit;
			a=a/10;

		}System.out.print(count);
		sc.close();
	}

}

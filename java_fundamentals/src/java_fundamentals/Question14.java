package java_fundamentals;
import java.util.Scanner;
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}

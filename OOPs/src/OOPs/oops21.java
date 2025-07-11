package OOPs;
import java.util.Optional;
import java.util.Scanner;

public class oops21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter address (or press Enter to simulate null): ");
		String input = sc.nextLine();
		String address = input.isEmpty() ? null : input;
		Optional<String> optionalAddress = Optional.ofNullable(address);
		String result = optionalAddress.orElse("India");
		System.out.println("Address: " + result);
		sc.close();
	}
}

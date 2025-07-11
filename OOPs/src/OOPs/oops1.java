package OOPs;

import java.util.Scanner;

public class oops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter width of the box: ");
		double width = sc.nextDouble();
		System.out.print("Enter height of the box: ");
		double height = sc.nextDouble();
		System.out.print("Enter depth of the box: ");
		double depth = sc.nextDouble();
		Box box = new Box(width, height, depth);
		System.out.println("Volume of the box is: " + box.getVolume());
		sc.close();
	}
}

class Box {
	double width, height, depth;

	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	double getVolume() {
		return width * height * depth;
	}
}

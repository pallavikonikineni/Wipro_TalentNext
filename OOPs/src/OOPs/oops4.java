package OOPs;

public class oops4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		System.out.println("--- Animal Actions ---");
		animal.eat();
		animal.sleep();
		
		Bird bird = new Bird();
		System.out.println("\n--- Bird Actions ---");
		bird.eat();
		bird.sleep();
		bird.fly();
	}
}

class Animal {
	public void eat() {
		System.out.println("Animal is eating");
	}

	public void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Bird extends Animal {
	public void eat() {
		System.out.println("Bird is pecking food");
	}
	public void sleep() {
		System.out.println("Bird is sleeping on a tree");
	}

	public void fly() {
		System.out.println("Bird is flying high in the sky");
	}
}

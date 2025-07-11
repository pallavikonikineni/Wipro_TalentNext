package OOPs;

public class oops6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fruit = new Fruit("Generic Fruit", "Sweet", "Medium");
		fruit.eat();

		Apple apple = new Apple("Apple", "Sweet and Crispy", "Medium");
		apple.eat();

		Orange orange = new Orange("Orange", "Tangy and Juicy", "Medium");
		orange.eat();
	}
}

class Fruit {
	protected String name;
	protected String taste;
	protected String size;

	public Fruit(String name, String taste, String size) {
		this.name = name;
		this.taste = taste;
		this.size = size;
	}

	public void eat() {
		System.out.println("Fruit: " + name + ", Taste: " + taste);
	}
}

class Apple extends Fruit {
	public Apple(String name, String taste, String size) {
		super(name, taste, size);
	}

	@Override
	public void eat() {
		System.out.println("Fruit: " + name + ", Taste: " + taste);
	}
}

class Orange extends Fruit {
	public Orange(String name, String taste, String size) {
		super(name, taste, size);
	}

	@Override
	public void eat() {
		System.out.println("Fruit: " + name + ", Taste: " + taste);
	}
}

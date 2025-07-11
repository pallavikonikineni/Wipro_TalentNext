package OOPs;

import java.util.Scanner;

public class oops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter author name: ");
		String authorName = sc.nextLine();
		System.out.print("Enter author email: ");
		String authorEmail = sc.nextLine();
		System.out.print("Enter author gender (M/F): ");
		char authorGender = sc.next().charAt(0);
		
		Author author = new Author(authorName, authorEmail, authorGender);
		
		sc.nextLine(); // consume leftover newline
		System.out.print("Enter book name: ");
		String bookName = sc.nextLine();
		System.out.print("Enter book price: ");
		double price = sc.nextDouble();
		System.out.print("Enter quantity in stock: ");
		int qty = sc.nextInt();
		
		Book book = new Book(bookName, author, price, qty);
		
		System.out.println("\n--- Book Details ---");
		System.out.println("Name: " + book.getName());
		System.out.println("Price: " + book.getPrice());
		System.out.println("Quantity in Stock: " + book.getQtyInStock());
		
		System.out.println("--- Author Details ---");
		System.out.println("Name: " + book.getAuthor().getName());
		System.out.println("Email: " + book.getAuthor().getEmail());
		System.out.println("Gender: " + book.getAuthor().getGender());
		
		sc.close();
	}
}

class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}
}

class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;

	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
}

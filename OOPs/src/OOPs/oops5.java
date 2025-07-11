package OOPs;

import java.util.Scanner;

public class oops5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = sc.nextLine();

		System.out.print("Enter annual salary: ");
		double salary = sc.nextDouble();

		System.out.print("Enter start year: ");
		int startYear = sc.nextInt();

		sc.nextLine(); // consume leftover newline
		System.out.print("Enter national insurance number: ");
		String insuranceNumber = sc.nextLine();

		Employee emp = new Employee(name, salary, startYear, insuranceNumber);

		System.out.println("\n--- Employee Details ---");
		System.out.println("Name: " + emp.getName());
		System.out.println("Annual Salary: " + emp.getAnnualSalary());
		System.out.println("Start Year: " + emp.getStartYear());
		System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

		sc.close();
	}
}

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Employee extends Person {
	private double annualSalary;
	private int startYear;
	private String nationalInsuranceNumber;

	public Employee(String name, double annualSalary, int startYear, String nationalInsuranceNumber) {
		super(name);
		this.annualSalary = annualSalary;
		this.startYear = startYear;
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	public String getNationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}

	public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}
}

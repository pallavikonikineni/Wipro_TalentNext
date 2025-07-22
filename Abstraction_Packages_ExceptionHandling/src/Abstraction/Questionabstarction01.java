package Abstraction;

import java.util.Scanner;

abstract class Compartment {
	abstract String notice();
}

class FirstClass extends Compartment {
	String notice() {
		return "First Class Compartment";
	}
}

class Ladies extends Compartment {
	String notice() {
		return "Ladies Compartment";
	}
}

class General extends Compartment {
	String notice() {
		return "General Compartment";
	}
}

class Luggage extends Compartment {
	String notice() {
		return "Luggage Compartment";
	}
}

public class Questionabstarction01 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Compartment[] compartments = new Compartment[10];

        System.out.println("Enter compartment type numbers for 10 coaches:");
System.out.println("1. FirstClass\n2. Ladies\n3. General\n4. Luggage");

for (int i = 0; i < compartments.length; i++) {
    System.out.print("Enter type for coach " + (i + 1) + ": ");
int choice = 0;
if (sc.hasNextInt()) {
    choice = sc.nextInt();
} else {
    sc.next(); 

switch (choice) {
    case 1:
        compartments[i] = new FirstClass();
        break;
    case 2:
        compartments[i] = new Ladies();
        break;
    case 3:
        compartments[i] = new General();
        break;
    case 4:
        compartments[i] = new Luggage();
        break;
    default:
        System.out.println("Invalid choice, assigning General by default.");
            compartments[i] = new General();
    }
}

System.out.println("\nCompartment Notices:");
        for (Compartment c : compartments) {
            System.out.println(c.notice());
        }

        sc.close();
    }
	}
}
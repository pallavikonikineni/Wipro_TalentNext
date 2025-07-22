package Abstraction;

import java.util.Scanner;

class Student {
	private String name;
	private int[] marks;
	private String grade;

	public Student() {
	}

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public int[] getMarks() {
		return marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}

class NullMarksArrayException extends Exception {
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "mark array is null";
	}
}

class NullNameException extends Exception {
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "name is null";
	}
}

class NullStudentObjectException extends Exception {
	private static final long serialVersionUID = 1L;


	public String toString() {
		return "object is null";
	}
}

class StudentReport {
	public String findGrades(Student studentObject) {
		int[] marks = studentObject.getMarks();
		for (int mark : marks) {
			if (mark < 35) {
				return "F";
			}
		}
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		if (sum < 150)
			return "C";
		else if (sum < 200)
			return "B";
		else if (sum < 250)
			return "A";
		else
			return "A+";
	}

	public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
		if (s == null)
			throw new NullStudentObjectException();
		if (s.getName() == null)
			throw new NullNameException();
		if (s.getMarks() == null)
			throw new NullMarksArrayException();
		return "VALID";
	}
}

class StudentService {
	public int findNumberOfNullMarksArray(Student[] s) {
		int c = 0;
		if (s != null) {
			for (Student student : s) {
				if (student != null && student.getMarks() == null) {
					c++;
				}
			}
		}
		return c;
	}

	public int findNumberOfNullName(Student[] s) {
		int c = 0;
		if (s != null) {
			for (Student student : s) {
				if (student != null && student.getName() == null) {
					c++;
				}
			}
		}
		return c;
	}

	public int findNumberOfNullObjects(Student[] s) {
		int c = 0;
		if (s != null) {
			for (Student student : s) {
				if (student == null) {
					c++;
				}
			}
		}
		return c;
	}
}

public class Project {
	static Student[] data;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		data = new Student[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine(); 
			System.out.println("Enter details for student " + (i + 1) + ":");
			System.out.print("Enter name (or type 'null' for null name): ");
			String name = sc.nextLine();
			if (name.equals("null")) {
				name = null;
			}

			System.out.print("Enter number of marks (enter 0 for null marks): ");
			int marksCount = sc.nextInt();
			int[] marks = null;
			if (marksCount > 0) {
				marks = new int[marksCount];
				for (int j = 0; j < marksCount; j++) {
					System.out.print("Enter mark " + (j + 1) + ": ");
					marks[j] = sc.nextInt();
				}
			}

			if (name == null && marks == null) {
				data[i] = null;
			} else {
				data[i] = new Student(name, marks);
			}
		}

		StudentReport report = new StudentReport();
		StudentService service = new StudentService();

		for (int i = 0; i < data.length; i++) {
			try {
				String result = report.validate(data[i]);
				if ("VALID".equals(result)) {
					String grade = report.findGrades(data[i]);
					data[i].setGrade(grade);
					System.out.println("Grade for student " + data[i].getName() + ": " + grade);
				}
			} catch (Exception e) {
				System.out.println("Exception for student at index " + i + ": " + e);
			}
		}

		System.out.println("Number of Null Marks Array: " + service.findNumberOfNullMarksArray(data));
		System.out.println("Number of Null Name: " + service.findNumberOfNullName(data));
		System.out.println("Number of Null Objects: " + service.findNumberOfNullObjects(data));

		sc.close();
	}
}
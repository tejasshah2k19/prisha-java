package core;

import java.util.Scanner;

public class InheritancePic {

	public static void main(String[] args) {

		Regular r = new Regular();
		r.getData();
		r.printData();
	}
}

class Staff {
	Scanner scr = new Scanner(System.in);
	String name;

	//
	void getData() {
		System.out.println("Enter name");
		name = scr.next();
	}

	void printData() {
		System.out.println("Name : " + name);
	}
}

class Teacher extends Staff {
	String language; // self
	// staff :: name

	void getData() {
		System.out.println("Enter Language");
		language = scr.next();
	}

	void printData() {
		System.out.println("Language : " + language);
	}
}

class Typist extends Staff {
	int speed;

	// staff :: name
	void getData() {
		super.getData(); // Staff
		System.out.println("Enter speed");
		speed = scr.nextInt();
	}

	void printData() {
		super.printData();
		System.out.println("Speed : " + speed);
	}
}

class Officer extends Staff {
	String grade;

	// staff :: name
	void getData() {
		System.out.println("Enter Grade");
		grade = scr.next();
	}

	void printData() {
		System.out.println("Grade : " + grade);
	}
}

class Regular extends Typist {
	int salary;

	// Typist :: speed
	// Staff :: name
	void getData() {
		super.getData(); // super -> parent property
		System.out.println("Enter Salary");
		salary = scr.nextInt();
	}

	void printData() {
		super.printData();
		System.out.println("Salary : " + salary);
	}
}

class Casual extends Typist {
	int dailyWages;

	// Typist :: speed
	// Staff :: name
	void getData() {
		System.out.println("Enter DailyWages");
		dailyWages = scr.nextInt();
	}

	void printData() {
		System.out.println("DailyWages : " + dailyWages);
	}
}

package core;

public class DemoC {

	public static void main(String[] args) {

		Employee e = new Employee();// constructor

		System.out.println(e.name);// null
		System.out.println(e.salary);// null
		System.out.println(e.age);// 0

		Employee e2 = new Employee();
		System.out.println(e2.name);// ram

		Employee e3 = new Employee("laxman", 12000, 12);
		System.out.println(e3.name);// ram

	}

}

class Employee {
	String name;
	Integer salary;
	int age;

	// special method - which has same name as a class name
	// method name -> class name and it must not have any return type
	// to initialize the instance variable -> class -> variable
	// constructor will call automatically when you create object/instance
	Employee() {
		name = "ram";
		salary = 100;
		age = 20;
	}

	Employee(String name, Integer salary, int a) {
		this.name = name;
		this.salary = salary;
		age = a;
	}

	// no return
	void getData() {
		// scanner
	}

	// return int
	int getAge() {
		return age;
	}

}

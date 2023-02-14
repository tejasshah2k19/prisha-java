package week10;

public class Person {
	// variable
	// instance variable
	String name;
	int age;
	String address;
	char gender;
	// String id;

	// constructor
	// its a special method which has same name as class name
	// and it must not have any return type.
	// use :-> to initialize the variable.
	// we don't need to invoke this, it will call automatically when
	// we create instance/object.

	boolean isVoteE(int ageCriteria) {
		if (this.age >= ageCriteria) {
			return true;
		} else {
			return false;
		}
	}

	Person() {
		name = "ram";
		age = 13;
		address = "ahmedabad";
		gender = 'M';
	}

	void getData() {
		int abc;// local variable
		// read
	}

	// not static
	// instance method
	// this method must be call using object/instance
	void display() {
		System.out.println("Name = > " + name);
		System.out.println("Age => " + age);
		System.out.println("Address => " + address);
		System.out.println("Gender => " + gender);
	}

	// this method we can call using class name or using object
	static void demo() {
		System.out.println("i am static method...");
	}

	// getters for all variable

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	String getAddress() {
		return address;
	}

	char getGender() {
		return gender;
	}

	// override equals method

	public boolean equals(Object o) {
		Person tmp = (Person) (o); // p1
		// return name.equals(tmp.name);
		return age == tmp.age; // age -> p.age
	}

	public static void main(String[] args) {
//		display();

//		String s = new String("royal");
//		s.length();

		Person p = new Person(); // object creation
		p.display();
		Person p1 = new Person(); // object creation
		p1.display();

		System.out.println("*******************");

		p.name = "laxman";
		p1.name = "ravan";
		p.display();
		p1.display();

		Person.demo();

		System.out.println("use : getters : ");
		System.out.println(p.getName());

		System.out.println(p.equals(p1));
		p.isVoteE(23);
		
	}

}

//ADT -> String 

//
package week10;

public class ToStringDemo {

	public static void main(String[] args) {
		Product p = new Product();
		p.setName("iphone 13");
		p.setPrice(55000);

		System.out.println(p.getName());//
		System.out.println(p.getPrice());
	
		System.out.println(p);// object -> hashcode -> memory address 
		//p ->  p.toString() 
		
	}
}

class Product {
	String name;
	int price;

	void setName(String name) {
		this.name = name;
	}

	void setPrice(int price) {
		this.price = price;
	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}
	
	public String toString() {
		return name;
	}
	
}

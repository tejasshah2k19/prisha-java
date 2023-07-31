package week8;

import java.util.Collection;

public class X {
	public static void main(String[] args) {
	}

//	class Greeting {
//		private  void greet(String s) {
//			System.out.println("Hello " + s);
//		}
//	}

}

class Foo {
	public <T> Collection<T> foo(Collection<T> arg) {
		return null;
	}
}

class Bar extends Foo {
//	@Override
//	public Collection<String> foo(Collection<String> arg) {
//		return null;
//	}

//second true
//	public <T> Collection<T> foo(Stream<T> arg) {
//		return null;
//	}
	//fourth true 
//	public <T> Collection<T> foo(Collection<T> arg) {
//		return null;
//	}
	
	//fifth true 
//	@Override
//	public <T> List<T> foo(Collection<T> arg) {
//		return null;
//	}
	
	 
	
}
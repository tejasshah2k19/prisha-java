package stack;

public class StackWithGeneric {
	public static void main(String[] args) {

		MyStack<String> m = new MyStack<String>(5);
		m.push("ram");
		
		MyStack<Integer> i = new MyStack<Integer>(5);
		i.push(20);
		
		System.out.println(i.pop());
	}
}

class MyStack<T> {
	T[] s;// 5
	int top = -1;// empty

	MyStack(int n) {// 5
		s = (T[]) new Object[n];
	}

	boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	boolean isFull() {
		if (top == s.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	void push(T x) {
		top++;
		s[top] = x;
	}

	T pop() {
		T tmp = s[top]; // laxman
		s[top] = null;
		top--;
		return tmp;
	}

}

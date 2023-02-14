package stack;

public class StackDemo {

	public static void main(String[] args) {
		StackOfString ss = new StackOfString(5);
		ss.push("ram");
		ss.push("laxman");
	}
}

class StackOfString {
	String s[];// 5
	int top = -1;// empty

	StackOfString(int n) {// 5
		s = new String[n];
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

	void push(String x) {
		top++;
		s[top] = x;
	}

	String pop() {
		String tmp = s[top]; // laxman
		s[top] = null;
		top--;
		return tmp;
	}

}
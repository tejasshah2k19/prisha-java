
public class TreeDemo {

	Node addNode(Node root, int num) { // 200,50
		if (root == null) {
			root = new Node();
			root.data = num;
			root.left = null;
			root.right = null;
			return root;
		} else if (root.data > num) {
			// left
			Node l = new Node();
			l.data = num;

			root.left = l;

		} else if (root.data < num) {
			// right
			Node r = new Node();
			r.data = num;
			root.right = r;

		}
		return root;
	}

	public static void main(String[] args) {
		Node root = null;
		TreeDemo t = new TreeDemo();
		root = t.addNode(root, 200);
		t.addNode(root, 50);
		t.addNode(root, 300);

	}
}

class Node {
	int data;
	Node left, right;
}
import java.util.Stack;


public class Tree {
	private Node root;
	public int nodeNo; // number of nodes
	
	public Tree() {
		this.root = null;
		this.nodeNo = 0;
	}
	
	
	public Node find(int key) {
		Node current = this.root;
		
		if (current == null)
			return null;
		else {
			while (current.id != key) {
				if (key < current.id)
					current = current.leftChild;
				else
					current = current.rightChild;
			}
		}
		return current;
	}
	
	public void insert(int id, double dd) {
		Node newNode = new Node();
		newNode.id = id;
		newNode.dd = dd;
		if (root == null) {
			this.root = newNode;
			nodeNo++;
		} else {
			Node current = root;
			while (true) {
				Node parent = current;
				if (id < current.id) {
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = newNode;
						nodeNo++;
						return;
					}
				} else {
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						nodeNo++;
						return;
					}
				}
			}
		}
	}
	
	public void traverseInOrder(Node localRoot) {
		if (localRoot != null) {
			traverseInOrder(localRoot.leftChild);
			System.out.print("localRoot.id=" + localRoot.id + " \n");
			traverseInOrder(localRoot.rightChild);
		}
	}
	
	public Node minimumSearch() {
		Node current;
		Node last = null;
		current = root;
		while (current != null) {
			last = current;
			current = current.leftChild;
		}
		return last;
	}
	
	public Node maximumSearch() {
		Node current;
		Node last = null;
		current = root;
		while (current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}
	
	public void displayTree() {
		Stack<Node> globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmply = false;
		System.out.println("................................");
		while (isRowEmply == false) {
			Stack<Node> localStack = new Stack();
			isRowEmply = true;
			
			for (int j = 0; j < nBlanks; j++) 
			System.out.print(' ');	
			
			while (globalStack.isEmpty() != false) {
				Node temp = (Node)globalStack.pop();
				if (temp != null) {
					System.out.print(temp.id);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					
					if (temp.leftChild != null || temp.rightChild != null)
						isRowEmply = false;
				} else {
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for (int j=0 ; j < nBlanks*2-2; j++)
					System.out.print(' ');
			}
			System.out.println();
			nBlanks /= 2;
			while (localStack.isEmpty() != false)
				globalStack.push(localStack.pop());
		}
		System.out.print("................................");
	}
}

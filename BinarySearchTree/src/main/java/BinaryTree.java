
public class BinaryTree {
	// quick searching of an ordered array
	// quick insertion, deletion of a linked list
	// leaf = has no children, parent/child
	
	private Node root;
	private int nodeNo;
	
	public BinaryTree() {
		this.root = null;
		this.nodeNo = 0;
	}
	
	public void insert(int id, long dd) {
		Node newNode = new Node();
		newNode.id = id;
		newNode.dd = dd;
		
		if (root == null) {
			root = newNode;
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
					if (current == null) {
						parent.rightChild = newNode;
						nodeNo++;
						return;
					}
				}
			}
		}
	}
}

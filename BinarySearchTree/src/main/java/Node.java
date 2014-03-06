
public class Node {
	// quick searching of an ordered array
	// quick insertion, deletion of a linked list
	// leaf = has no children, parent/child
	
	int id; // key
	long dd; // other data
	boolean deleted;
	Node leftChild;
	Node rightChild;
	
	public Node() {
		this.deleted = false;
	}
	
	public void displayNode() {
		System.out.println("{" + id + ", " + dd + "}");
	}
	
}

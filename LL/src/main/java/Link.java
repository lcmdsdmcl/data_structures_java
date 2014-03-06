
public class Link {
	public int id;
	public Link next;
	
	public Link(int id) {
		this.id = id;
	}
	
	public void displayLLink() {
		System.out.println("{" + this.id + "}");
	}
}

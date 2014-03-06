
public class LinkList {
	private Link first;
	
	public LinkList() {
		this.first = null;
	}
	
	public void setFirst(Link first) {
		this.first = first;
	}
	
	public Link getFirst() {
		return this.first;
	}
	
	public void insertFirst(int id) {
		Link newLink = new Link(id);
		newLink.next = first;
		first = newLink;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public boolean isEmplty() {
		return (first == null);
	}
	
	public Link findLink(int id) {
		Link current = first;
		while (current.id != id) {
			if (current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;
	}
	
	public Link deleteLink(int id) {
		Link current = first;
		Link previous = null;
		
		while (current.id != id) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}
		
		if (current == first)
			first = first.next;
		else
			previous.next = current.next;
		
		return current;
	}
	
	public LinkIterator getIterator() {
		return new LinkIterator(this);
	}
}

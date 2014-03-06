
public class LinkIterator {
	private Link current;
	private Link previous;
	private LinkList linkList;
	
	public LinkIterator(LinkList linkList) {
		this.linkList = linkList;
		resetIterator();
	}
	
	public void resetIterator() {
		current = linkList.getFirst();
		previous = null;
	}
	
	public boolean atEndIterator() {
		return (current.next == null);
	}
	
	public void atNextIterator() {
		previous = current;
		current = current.next;
	}
	
	public Link atCurrentIterator() {
		return current;
	}
	
	public int deleteAtCurrentIterator() {
		int id = current.id;
		
		if (previous == null) {
			linkList.setFirst(current.next);
			resetIterator();
		} else {
			previous.next = current.next;
			if (atEndIterator())
				resetIterator();
			else
				current = current.next;
		}
		
		return id;
	}
	
	public void insertBeforeCurrentIterator(int id) {
		Link newLink = new Link(id);
		
		if (previous == null) {
			newLink.next = linkList.getFirst();
			linkList.setFirst(newLink);
			resetIterator();
		} else {
			newLink.next = current.next;
			previous.next = newLink;
			current = newLink;	
			
		}
	}
}

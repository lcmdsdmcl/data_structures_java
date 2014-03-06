
public class StackX {
	private char[] stackArray;
	private int maxSize;
	private int stackSize;
	
	public StackX(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray = new char[this.maxSize];
		this.stackSize = -1;
	}
	
	public void puch(char ch) {
		this.stackArray[++this.stackSize] = ch;
	}
	
	public char pop() {
		return this.stackArray[this.stackSize--];
	}
	
	public char peek() {
		return this.stackArray[this.stackSize];
	}
	
	public boolean isEmplty() {
		return (this.stackSize == -1);
	}
	
	public boolean isFull() {
		return (this.stackSize == this.maxSize-1);
	}
}

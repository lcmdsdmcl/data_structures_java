
public class QueueX {
	private char[] queueArray;
	private int maxSize;
	private int queueSize;
	private int front;
	private int rear;
	
	public QueueX(int maxSize) {
		this.maxSize = maxSize;
		this.queueArray = new char[this.maxSize];
		this.queueSize = 0;
		this.front = 0;
		this.rear = -1;
	}
	
	public void insertQueue(char ch) { // call isFull() before it
		if (rear == maxSize-1) // wrap around if it's full
			rear = -1;
		queueArray[++rear] = ch;
		queueSize++;
	}
	
	public char removeQueue() { // call isEmpty() before if
		char ch = queueArray[front++];
		if (front == maxSize) // wrap around
			front = 0;
		queueSize--;
		return ch;
	}
	
	public char peekQueue() {
		return queueArray[front];
	}
	
	public boolean isEmpty() {
		return (queueSize == 0);
	}
	
	public boolean isFull() {
		return (queueSize == maxSize);
	}
}

// created by christian hilson

package assign2;

public class LwtQueue {
	public int[] queue;
	private int rear = 0;
	private int front = 0;
	private int size = 0;
	
	public LwtQueue(int n) {
		queue = new int[n];
		size = n;
	}
	
	public void add(int n) {
		if(this.isFull()) {
			throw new LwtQueueFull ("queue is full");
		} else {
			queue[rear % size] = n;
			rear++;
		}
	}
	
	public int remove() {
		if(this.isEmpty()) {
			throw new LwtParserException ("queue is empty");
		} else {
			int removeInt = queue[front % size];
			front++;
			return removeInt;
		}
	}
	
	public boolean isEmpty() {
		if(rear == front) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(rear - front == size) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
        for(int i = front; i < rear; i++) {
        	sb.append(queue[i % size] + " ");
        }
        sb.append("]");
        return sb.toString();
	}
}

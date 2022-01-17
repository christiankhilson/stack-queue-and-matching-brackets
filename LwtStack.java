// created by christian hilson

package assign2;

public class LwtStack {
	
	private int top = 0;
	private int size = 0;
	public int[] stack;
	
	public LwtStack(int n) {
		stack = new int[n];
		size = n;
	}
	
	public void push(int n) throws LwtStackFull {		
		if(this.isFull()) {
			throw new LwtStackFull ("stack is full");
		} else {
			stack[top] = n;
			top++;
		}
	}
	
	public int pop() {
		if(this.isEmpty()) {
			throw new LwtStackEmpty ("stack is empty");
		} else {
			int popInt = stack[top - 1];
			top--;
			return popInt;
		}
	}
	
	public boolean isEmpty() {
		if(top == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(top == size - 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
        for(int i = 0; i < top; i++) {
        	sb.append(stack[i] + " ");
        }
        sb.append("]");
        return sb.toString();
	}
}

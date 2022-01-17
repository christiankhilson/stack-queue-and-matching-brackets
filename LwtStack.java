// created by christian hilson

package assign2;

import java.lang.reflect.Array;

public class LwtStack<E> {
	
	private int top = 0;
	private int size = 0;
	public E[] stack;
	
	@SuppressWarnings("unchecked")
	public LwtStack(Class<E> c, int n) {
		stack = (E[]) Array.newInstance(c, n);
		size = n;
	}
	
	public void push(E n) throws LwtStackFull {		
		if(this.isFull()) {
			throw new LwtStackFull ("stack is full");
		} else {
			stack[top] = n;
			top++;
		}
	}
	
	public E pop() {
		if(this.isEmpty()) {
			throw new LwtStackEmpty ("stack is empty");
		} else {
			E popVar = stack[top - 1];
			top--;
			return popVar;
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

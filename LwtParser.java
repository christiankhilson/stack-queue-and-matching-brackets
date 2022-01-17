// created by christian hilson

package assign2;

import java.util.Stack;

public class LwtParser {

	public static void main(String[] args) {
		System.out.println(parsing("( [ { } ( ) ] ( ) { ( ) } )"));
	}
	
	public static String parsing(String str) {
		LwtStack intStack = new LwtStack(str.length());
		Stack<Character> brackStack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int c = 1;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				continue;
			}
			
			if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
				intStack.push(c);
				sb.append(c);
				c++;
				brackStack.push(str.charAt(i));
			} else if (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
				if(brackStack.isEmpty()) {
					return "cannot parse";
				} else if (str.charAt(i) == ')' && brackStack.peek() == '(') {
					brackStack.pop();
					sb.append(intStack.pop());
				} else if (str.charAt(i) == ']' && brackStack.peek() == '[') {
					brackStack.pop();
					sb.append(intStack.pop());
				} else if (str.charAt(i) == '}' && brackStack.peek() == '{') {
					brackStack.pop();
					sb.append(intStack.pop());
				} else {
					return "cannot parse";
				}
			} else {
				throw new LwtParserException ("invalid character in the string");
			}
		}
		
		return sb.toString();
	}

}

package Lab.DataStructure.Problem1;
import java.util.Stack;

/////////////////// Driver Class ///////////////////
public class Brackets {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		
		String input = "{[()]}";
		
		for(int i=0;i<input.length();i++) {
			String bracket = String.valueOf(input.charAt(i));
			
			String reverse_bracket = "";
			
			if(bracket.equals("{")) 
				reverse_bracket = "}";
			else if(bracket.equals("[")) 
				reverse_bracket = "]";
			else if(bracket.equals("(")) 
				reverse_bracket = ")";
			
			/////// Keep track of the reversed brackets ///////
			if (i<input.length()/2) { 
				stack.push(reverse_bracket);
			}
			
			if(i>=input.length()/2) {
				/////// Check if reversed brackets match or not ///////
				if(bracket.equals(stack.peek())) {
					stack.pop();
					continue;
				}
				else {
					System.out.println("NOT BALANCED");
					break;
				}
			}
		}
		if (stack.empty()) {
			System.out.println("BALANCED");
		}
	}
}
	
	


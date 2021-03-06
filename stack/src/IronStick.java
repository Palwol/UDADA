import java.util.*;

public class IronStick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		
		int stick = 0, slice = 0;
		
		String ps = sc.nextLine();
		for(int i=0; i<ps.length(); i++) {
			if(ps.charAt(i) == '(') {
				stack.push("(");
				stick++;
				slice++;
			}
			if(ps.charAt(i) == ')') {
				if(stack.peek().equals("(")) {
					stick--;
					slice--;
					slice += stick;
				}
				if(stack.peek().equals(")")){
					stick--;
				}
				stack.push(")");
			}
		}
		System.out.print(slice);
	}
}

import java.util.*;

public class Parenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
			String ps = sc.nextLine();
			int c = 1;
			Stack<String> stack = new Stack<String>();
			
			for(int j=0; j<ps.length(); j++) {
				if(ps.charAt(j) == '(')
					stack.push("(");
				if(ps.charAt(j) == ')') {
					if(stack.isEmpty()) {
						c = 0;
						break;
					}
					else
						stack.pop();
				}	
			}
			if(c == 0)
				System.out.println("NO");
			else if(stack.isEmpty() == false)
				System.out.println("NO");
			else
				System.out.println("YES");

		}

	}

}

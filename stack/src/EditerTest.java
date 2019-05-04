import java.util.*;
public class EditerTest {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		
		String words = sc.nextLine();
		for(int i=0; i<words.length(); i++) {
			left.push(words.charAt(i));
		}
		
		int n = sc.nextInt();
		sc.nextLine();
		
		while(n-- >0) {
			String cmd = sc.nextLine();
			if(cmd.equals("L")) {
				if(!left.empty()) {
					right.push(left.pop());
				}
			}
			else if(cmd.equals("D")) {
				if(!right.empty()) {
					left.push(right.pop());
				}
			}
			else if(cmd.equals("B")) {
				if(!left.empty())
					left.pop();
			}
			else {
				left.push(cmd.charAt(2));
			}
		}
		
		while(!left.empty()) {
			right.push(left.pop());
		}
		while(!right.empty()) {
			System.out.print(right.pop());
		}
		long end = System.currentTimeMillis();
		System.out.println( "실행 시간 : " + (end-start)/1000.0 +"초");
	}
	
}
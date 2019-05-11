import java.util.*;
import java.io.*;
public class EditerTest {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		
		String words = rd.readLine();
		for(int i=0; i<words.length(); i++) {
			left.push(words.charAt(i));
		}
		
		int n = Integer.parseInt(rd.readLine());
		
		while(n-- >0) {
			String cmd = rd.readLine();
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

	}
	
}
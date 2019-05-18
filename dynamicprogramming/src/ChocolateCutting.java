import java.util.*;

public class ChocolateCutting {

	public static void main(String[] args) {
		int n, m, answer;
		
		Scanner sc = new Scanner(System.in);
		String[] tokens = sc.nextLine().split(" ");
		n = Integer.parseInt(tokens[0]);
		m = Integer.parseInt(tokens[1]);
		
		answer = (n-1) + (m-1)*n;
		System.out.println(answer);

	}

}

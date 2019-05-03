import java.util.*;

public class StringToken2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.println("문자열을 입력하시오: ");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + ", ");
			n++;
		}
		System.out.println("\n모두 " +  n + "개의 단어가 있습니다.");
	}

}

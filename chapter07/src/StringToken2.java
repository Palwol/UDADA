import java.util.*;

public class StringToken2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.println("���ڿ��� �Է��Ͻÿ�: ");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + ", ");
			n++;
		}
		System.out.println("\n��� " +  n + "���� �ܾ �ֽ��ϴ�.");
	}

}

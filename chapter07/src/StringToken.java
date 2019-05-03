import java.util.Scanner;

public class StringToken {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하시오: ");
		String[] tokens = sc.nextLine().split(" ");
		
		for(String token:tokens) {
			System.out.print(token + ", ");
		}
		System.out.println("\n모두 " + tokens.length + "개의 단어가 있습니다.");

	}

}

import java.util.Scanner;

public class StringToken {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��Ͻÿ�: ");
		String[] tokens = sc.nextLine().split(" ");
		
		for(String token:tokens) {
			System.out.print(token + ", ");
		}
		System.out.println("\n��� " + tokens.length + "���� �ܾ �ֽ��ϴ�.");

	}

}

import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long fact = 1;
		int n;
		
		System.out.print("������ �Է��Ͻÿ�: ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			fact *= i;
		}
		
		System.out.println(n+"!�� "+fact+"�Դϴ�.");

	}

}

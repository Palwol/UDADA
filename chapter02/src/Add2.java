import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, result;
		
		System.out.print("첫번째 숫자를 입력하시오: ");
		a = input.nextInt();
		System.out.print("두번째 숫자를 입력하시오: ");
		b = input.nextInt();
		
		result = a+b;
		
		System.out.println(result);
		

	}

}

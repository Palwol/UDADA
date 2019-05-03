import java.util.*;
public class Add {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, sum;
		
		System.out.print("첫번째 값: ");
		num1 = sc.nextInt();
		System.out.print("두번째 값: ");
		num2 = sc.nextInt();
		System.out.print("세번째 값: ");;
		num3 = sc.nextInt();
		sum = num1+num2+num3;
		
		System.out.println(num1+"+"+num2+"+"+num3+"="+sum);
		

	}

}

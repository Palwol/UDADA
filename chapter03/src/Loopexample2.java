import java.util.*;
public class LoopExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i = 1;
		
		System.out.print("������ �߿��� ����ϰ� ���� ���� �Է��Ͻÿ�: ");
		num = sc.nextInt();
		
		while(i<10) {
			System.out.println(num+"*"+i+" = "+num*i);
			i++;
		}

	}

}

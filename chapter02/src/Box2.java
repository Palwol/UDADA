import java.util.*;
public class Box2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int orange, box, remain;
		
		System.out.print("�������� ������ �Է��Ͻÿ�: ");
		orange = sc.nextInt();
		
		box = orange/10;
		remain = orange%10;
		
		System.out.println(box+"�ڽ��� �ʿ��ϰ� "+remain+"���� �����ϴ�.");

	}

}

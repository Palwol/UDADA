import java.util.*;
public class Box {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w, h; 
		double area, perimeter;
		
		System.out.print("�簢���� ���θ� �Է��Ͻÿ�: ");
		w = sc.nextInt();
		
		System.out.print("�簢���� ���θ� �Է��Ͻÿ�: ");
		h = sc.nextInt();
		
		area = (double)w*h;
		perimeter = (double)2*(w+h);
		
		System.out.println("�簢���� ���̴� "+area);
		System.out.println("�簢���� �ѷ��� "+perimeter);

	}

}

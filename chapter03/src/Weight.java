import java.util.*;
public class Weight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height, weight, standard_w;
		
		System.out.print("Ű�� �Է��ϼ���: ");
		height = sc.nextInt();
		System.out.print("�����Ը� �Է��ϼ���: ");
		weight = sc.nextInt();
		
		standard_w = (height-100.0)*0.9;
		if(weight<standard_w)
			System.out.println("��ü���Դϴ�.");
		else if(weight == standard_w)
			System.out.println("ǥ��ü���Դϴ�.");
		else
			System.out.println("��ü���Դϴ�.");

	}

}

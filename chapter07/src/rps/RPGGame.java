package rps;
import java.util.*;

public class RPGGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String str;
		
		int comrps = random.nextInt(3);
		if(comrps == 0)
			str = "����";
		else if(comrps == 1)
			str = "����";
		else
			str = "��";
		System.out.println("�ϳ��� �����Ͻÿ�. ����(0), ����(1), ��(2)");
		int myrps = sc.nextInt();
		System.out.println("��ǻ�ʹ� " + str + "�� �½��ϴ�.");
		
		if(comrps == myrps)
			System.out.println("�����ϴ�.");
		else {
			if(comrps == 0) {
				if(myrps == 1)
					System.out.println("����� �̰���ϴ�.");
				if(myrps == 2)
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
			if(comrps == 1) {
				if(myrps == 0)
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				if(myrps == 2)
					System.out.println("����� �̰���ϴ�.");
			}
			if(comrps == 2) {
				if(myrps == 0)
					System.out.println("����� �̰���ϴ�.");
				if(myrps == 1)
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
		}

	}

}

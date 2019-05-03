package rps;
import java.util.*;

public class RPGGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String str;
		
		int comrps = random.nextInt(3);
		if(comrps == 0)
			str = "가위";
		else if(comrps == 1)
			str = "바위";
		else
			str = "보";
		System.out.println("하나를 선택하시오. 가위(0), 바위(1), 보(2)");
		int myrps = sc.nextInt();
		System.out.println("컴퓨터는 " + str + "를 냈습니다.");
		
		if(comrps == myrps)
			System.out.println("비겼습니다.");
		else {
			if(comrps == 0) {
				if(myrps == 1)
					System.out.println("당신이 이겼습니다.");
				if(myrps == 2)
					System.out.println("컴퓨터가 이겼습니다.");
			}
			if(comrps == 1) {
				if(myrps == 0)
					System.out.println("컴퓨터가 이겼습니다.");
				if(myrps == 2)
					System.out.println("당신이 이겼습니다.");
			}
			if(comrps == 2) {
				if(myrps == 0)
					System.out.println("당신이 이겼습니다.");
				if(myrps == 1)
					System.out.println("컴퓨터가 이겼습니다.");
			}
		}

	}

}

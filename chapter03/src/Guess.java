
import java.util.*;

public class Guess {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int guess, n = 0;
		int answer = (int)(Math.random()*100);
		
		do {
			System.out.print("������ �����Ͽ� ���ÿ�:");
			guess = s.nextInt();
			n += 1;
			if(guess<answer)
				System.out.println("LOW");
			else if(guess>answer)
				System.out.println("HIGH");
		} while(guess!=answer);
		
		System.out.println("�����մϴ�.�õ�Ƚ��=" + n);

	}

}

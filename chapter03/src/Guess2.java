import java.util.*;
public class Guess2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*100+1);
		int i=0, guess;
		
		do {
			System.out.print("������ �����Ͽ� ���ÿ�: ");
			guess = sc.nextInt();
			if(guess<num)
				System.out.println("LOW");
			else if(guess>num)
				System.out.println("HIGH");
			i++;
		} while(guess != num);
		System.out.println("�����մϴ�. �õ�Ƚ��="+i);

	}

}

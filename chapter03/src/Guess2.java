import java.util.*;
public class Guess2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*100+1);
		int i=0, guess;
		
		do {
			System.out.print("정답을 추측하여 보시오: ");
			guess = sc.nextInt();
			if(guess<num)
				System.out.println("LOW");
			else if(guess>num)
				System.out.println("HIGH");
			i++;
		} while(guess != num);
		System.out.println("축하합니다. 시도횟수="+i);

	}

}

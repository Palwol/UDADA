
import java.util.*;

public class Guess {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int guess, n = 0;
		int answer = (int)(Math.random()*100);
		
		do {
			System.out.print("정답을 추측하여 보시오:");
			guess = s.nextInt();
			n += 1;
			if(guess<answer)
				System.out.println("LOW");
			else if(guess>answer)
				System.out.println("HIGH");
		} while(guess!=answer);
		
		System.out.println("축하합니다.시도횟수=" + n);

	}

}

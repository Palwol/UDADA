import java.util.*;

public class Hangman {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		String[] words = {"java", "count", "school", "book", "student", "programmer"};
		int index = random.nextInt(words.length);
		String solution = words[index];
		
		StringBuffer answer = new StringBuffer(solution.length());
		
		for(int i=0; i<solution.length(); i++) {
			answer.append("_");
		}
		
		while(true) {
			System.out.println("현재의 상태: "+answer);
			System.out.print("글자를 추측하시오:");
			String c = sc.next();
			for(int i=0; i<solution.length(); i++) {
				if(c.charAt(0) == solution.charAt(i))
					answer.setCharAt(i, c.charAt(0));
			}
			if(answer.toString().equals(solution))
				break;
			
		}
		System.out.println("정답입니다: "+solution);
	}

}

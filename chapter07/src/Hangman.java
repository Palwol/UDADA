import java.util.*;

public class Hangman {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		String[] words = {"java", "milk", "salad", "burger", "count", "chocolate", "steak"};
		int index = random.nextInt(words.length);
		String solution = words[index];
		
		StringBuffer answer = new StringBuffer(solution.length());
		
		for(int i=0; i<solution.length(); i++) {
			answer.append("_");
		}
		
		while(true) {
			System.out.println("������ ����: "+answer);
			System.out.print("���ڸ� �����Ͻÿ�:");
			String c = sc.next();
			
			
		}
	}

}

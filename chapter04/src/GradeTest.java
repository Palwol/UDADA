
import java.util.Scanner;

class Grade {
	private int[] student;
	private int sum = 0;
	private double average;
	
	public Grade(int num) {
		student = new int[num];
	}
	
	public void take(int i, int score) {
		student[i] = score;
	}
	
	public int getSum() {
		for(int i=0; i<student.length; i++ ) {
			sum += student[i];
		}
		return sum;
	}
	
	public double getAverage() {
		average = sum/student.length;
		return average;
	}

}

public class GradeTest {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("학생수를 입력하시오:");
		int num = input.nextInt();
		
		Grade obj = new Grade(num);
		
		for(int i=0; i<num; i++) {
			System.out.print("성적을 입력하시오:");
			int score = input.nextInt();
			obj.take(i, score);
		}
				
	}

}

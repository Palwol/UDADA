import java.util.*;

class Grade{
	private int[] score;
	private int sum = 0;
	private double average;
	
	public Grade(int student) {
		score = new int[student];
	}
	
	public void inputScore(int i, int score) {
		this.score[i] = score;
	}
	
	public int getSum() {
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		return sum;
	}
	
	public double getAverage() {
		average = (double)sum/score.length;
		return average;
	}
	
}
public class GradeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л����� �Է��Ͻÿ�: ");
		int student = sc.nextInt();
		
		Grade obj = new Grade(student);
		
		for(int i=0; i<student; i++) {
			System.out.print("������ �Է��Ͻÿ�: ");
			int score = sc.nextInt();
			obj.inputScore(i, score);
		}
		
		int sum = obj.getSum();
		double average = obj.getAverage();
		
		System.out.println("�հ�: "+sum);
		System.out.println("���: "+average);

	}

}

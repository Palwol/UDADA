
import java.util.Scanner;

class MyMetric {
	private static double distance;
	
	public static double kiloToMile(double kilo) {
		distance = kilo/1.6093;
		return distance;
	}
}
public class MyMetricTest {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ÿ��� km�� �Է��Ͻÿ�:");
		double d = sc.nextDouble();
		
		System.out.println(d + "km�� ���Ϸ� �ٲٸ� " + MyMetric.kiloToMile(d));
	}

}

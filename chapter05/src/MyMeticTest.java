import java.util.*;
class MyMetric{
	private static final double MILE = 1.6093;
	private static double distance;
	public static double kiloToMile(double kilo) {
		distance = kilo/MILE;
		return distance;
	}
}

public class MyMeticTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ÿ��� km�� �Է��Ͻÿ�: ");
		double kilo = sc.nextDouble();
		double d = MyMetric.kiloToMile(kilo);
		System.out.println(kilo+"km�� ���Ϸ� �ٲٸ� "+d+"mile.");

	}

}

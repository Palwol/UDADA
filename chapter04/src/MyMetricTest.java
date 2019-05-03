
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
		
		System.out.print("거리를 km로 입력하시오:");
		double d = sc.nextDouble();
		
		System.out.println(d + "km를 마일로 바꾸면 " + MyMetric.kiloToMile(d));
	}

}

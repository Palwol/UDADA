import java.util.*;
public class Sphere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius, volume;
		
		System.out.print("���� ������: ");
		radius = sc.nextDouble();
		
		volume = 4.0/3.0*radius*radius*radius;
		
		System.out.println("���� ����: "+volume);

	}

}

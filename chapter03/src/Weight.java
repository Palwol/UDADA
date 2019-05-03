import java.util.*;
public class Weight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height, weight, standard_w;
		
		System.out.print("키를 입력하세오: ");
		height = sc.nextInt();
		System.out.print("몸무게를 입력하세오: ");
		weight = sc.nextInt();
		
		standard_w = (height-100.0)*0.9;
		if(weight<standard_w)
			System.out.println("저체중입니다.");
		else if(weight == standard_w)
			System.out.println("표준체중입니다.");
		else
			System.out.println("과체중입니다.");

	}

}

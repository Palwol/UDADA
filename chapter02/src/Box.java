import java.util.*;
public class Box {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w, h; 
		double area, perimeter;
		
		System.out.print("사각형의 가로를 입력하시오: ");
		w = sc.nextInt();
		
		System.out.print("사각형의 세로를 입력하시오: ");
		h = sc.nextInt();
		
		area = (double)w*h;
		perimeter = (double)2*(w+h);
		
		System.out.println("사각형의 넓이는 "+area);
		System.out.println("사각형의 둘레는 "+perimeter);

	}

}

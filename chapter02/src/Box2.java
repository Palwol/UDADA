import java.util.*;
public class Box2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int orange, box, remain;
		
		System.out.print("오렌지의 개수를 입력하시오: ");
		orange = sc.nextInt();
		
		box = orange/10;
		remain = orange%10;
		
		System.out.println(box+"박스가 필요하고 "+remain+"개가 남습니다.");

	}

}

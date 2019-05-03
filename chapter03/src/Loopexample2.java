import java.util.*;
public class LoopExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i = 1;
		
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오: ");
		num = sc.nextInt();
		
		while(i<10) {
			System.out.println(num+"*"+i+" = "+num*i);
			i++;
		}

	}

}

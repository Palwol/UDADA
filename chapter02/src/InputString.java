import java.util.*;
public class InputString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name, age;
		
		System.out.print("이름을 입력하시오: ");
		name = input.nextLine();
		
		System.out.print("나이를 입력하시오: ");
		age = input.nextLine();
		
		System.out.println(name + "님 안녕하세요! " + age + "살이시네요.");

	}

}

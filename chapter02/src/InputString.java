import java.util.*;
public class InputString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name, age;
		
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		name = input.nextLine();
		
		System.out.print("���̸� �Է��Ͻÿ�: ");
		age = input.nextLine();
		
		System.out.println(name + "�� �ȳ��ϼ���! " + age + "���̽ó׿�.");

	}

}

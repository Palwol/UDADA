import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money, price, tax, change;
		
		System.out.print("���� ��: ");
		money = sc.nextInt();
		System.out.print("��ǰ����: ");
		price = sc.nextInt();
		
		tax = (int)(price*0.1);
		change = money-price;
		
		System.out.println("�ΰ���: "+tax);
		System.out.println("�ܵ�: "+change);

	}

}

import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money, price, tax, change;
		
		System.out.print("πﬁ¿∫ µ∑: ");
		money = sc.nextInt();
		System.out.print("ªÛ«∞∞°∞›: ");
		price = sc.nextInt();
		
		tax = (int)(price*0.1);
		change = money-price;
		
		System.out.println("∫Œ∞°ºº: "+tax);
		System.out.println("¿‹µ∑: "+change);

	}

}

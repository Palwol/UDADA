import java.util.*;
public class FtoC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double c, f;
		
		System.out.print("È­¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
		f = sc.nextDouble();
		
		c = 5.0/9.0*(f-32.0);
		
		System.out.println("¼·¾¾¿Âµµ´Â "+c);

	}

}

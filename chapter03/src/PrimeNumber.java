
public class PrimeNumber {

	public static void main(String[] args) {
		System.out.print("2부터 100 사이 모든 소수:");
		for(int k=2; k<=100; k++) {
			int count = 0;
			for(int j=2; j<k; j++) {
				if(k%j == 0) {
					count ++;
					break;
				}
			}
			if(count == 0)
				System.out.print(" "+k);
		}

	}

}

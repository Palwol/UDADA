
public class CardGame {

	public static void main(String[] args) {
		
		String [] shape = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String [] number = {"2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Ace"};
		int[][] check = new int[4][12];
		int i, j, k = 0;
		
		while(k<5) {
			i = (int)(Math.random()*4);
			j = (int)(Math.random()*12);
			if(check[i][j] == 1)
				continue;
			else
				k += 1;
			check[i][j] = 1;
			System.out.println(shape[i] + "�� " + number[j]);
			
			
		}
			

	}

}

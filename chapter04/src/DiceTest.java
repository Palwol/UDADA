class Dice{
	private int value;
	
	public Dice() {
		value = 0;
	}
	
	public int roll() {
		return (int)(Math.random()*6+1);
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
public class DiceTest {

	public static void main(String[] args) {
		Dice obj1 = new Dice();
		Dice obj2 = new Dice();
		int dice1, dice2, count=0;
		
		do {
			obj1.roll();
			obj2.roll();
			dice1 = obj1.getValue();
			dice2 = obj2.getValue();
			System.out.println("주사위1= "+dice1+" 주사위2= "+dice2);
			count ++;
		} while(dice1+dice2 != 2);
		
		System.out.println("(1,1)이 나오는데 걸린 횟수= "+count);

	}

}

interface Animal{
	public void walk();
	public void fly();
	public void sing();
}

class Bird implements Animal{
	public void walk() {
		System.out.println("���� �� ����");
	}
	
	public void fly() {
		System.out.println("���� �� ����");
	}
	
	public void sing() {
		System.out.println("�뷡 �θ� �� ����");
	}
}
public class BirdTest {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

	}

}

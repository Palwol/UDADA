
class Circle{
	protected int radius;
	public Circle(int r) { radius = r; }
}

class Pizza extends Circle{
	String kind;
	
	public Pizza(String kind, int r) {
		super(r);
		this.kind = kind;
	}
	
	void print() {
		System.out.println("������ ����:" + kind + " ������ ũ��:" + radius);
	}
}

public class PizzaTest {

	public static void main(String[] args) {
		Pizza obj = new Pizza("Pepperoni", 20);
		obj.print();
	}

}

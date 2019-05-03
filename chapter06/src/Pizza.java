class Circle{
	protected int radius;
	public Circle(int r) {
		radius = r;
	}
}
public class Pizza extends Circle{
	private String topping;
	public Pizza(String topping, int r) {
		super(r);
		this.topping = topping;
	}
	public void print() {
		System.out.println("피자의 종류: "+topping+", 피자의 크기: "+radius);
	}
	public static void main(String[] args) {
		Pizza obj = new Pizza("Pepperoni", 20);
		obj.print();

	}

}

class Rectangle{
	int width, height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

public class ColorRectangle extends Rectangle{
	String color;
	public ColorRectangle(int width, int height, String color) {
		super(width, height);
		this.color = color;
	}

	public static void main(String[] args) {
		ColorRectangle obj = new ColorRectangle(100, 100, "blue");
		System.out.print("가로: "+obj.width);
		System.out.print(", 세로: "+obj.height);
		System.out.print(", 색상: "+obj.color);

	}

}

class Sports{
	String getName() {
		return "���� �������� ����.";
		}
	int getPlayer() {
		return 0;
	}
}
public class Soccer extends Sports{
	String getName() {
		return "�౸";
	}
	int getPlayer() {
		return 11;
	}

	public static void main(String[] args) {
		Sports soccer = new Soccer();
		String name = soccer.getName();
		int player = soccer.getPlayer();
		
		System.out.println("����̸�: "+name);
		System.out.println("����ڼ�: "+player);

	}

}

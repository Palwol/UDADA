
class Sports{
	String getName() {
		return "���� �������� ����";
	}
	int getPlayer() {
		return 0;
	}
}

class Soccer extends Sports{
	@Override
	public String getName() {
		return "�౸";
	}
	
	public int getPlayer() {
		return 11;
	}
}
public class SoccerTest {

	public static void main(String[] args) {
		Soccer obj = new Soccer();
		System.out.println("����̸�: " + obj.getName());
		System.out.println("����ڼ�: " + obj.getPlayer());

	}

}

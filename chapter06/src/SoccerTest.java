
class Sports{
	String getName() {
		return "아직 결정되지 않음";
	}
	int getPlayer() {
		return 0;
	}
}

class Soccer extends Sports{
	@Override
	public String getName() {
		return "축구";
	}
	
	public int getPlayer() {
		return 11;
	}
}
public class SoccerTest {

	public static void main(String[] args) {
		Soccer obj = new Soccer();
		System.out.println("경기이름: " + obj.getName());
		System.out.println("경기자수: " + obj.getPlayer());

	}

}

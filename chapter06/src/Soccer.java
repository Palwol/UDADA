class Sports{
	String getName() {
		return "아직 결정되지 않음.";
		}
	int getPlayer() {
		return 0;
	}
}
public class Soccer extends Sports{
	String getName() {
		return "축구";
	}
	int getPlayer() {
		return 11;
	}

	public static void main(String[] args) {
		Sports soccer = new Soccer();
		String name = soccer.getName();
		int player = soccer.getPlayer();
		
		System.out.println("경기이름: "+name);
		System.out.println("경기자수: "+player);

	}

}

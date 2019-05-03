import java.util.*;

abstract class Sprite {
	int x=3, y=3;
	abstract void move(char c);
}

class Gold extends Sprite {
	public Gold() { x = 3; y = 6; }
	void move(char c) { }
}

class Main extends Sprite {
	void move(char c) {
		if (c == 'h') --x; // 왼쪽
		else if (c == 'j') --y; // 위쪽
		else if (c == 'k') ++y; // 아래쪽
		else if (c == 'l') ++x; // 오른쪽
	}
}
class Monster extends Sprite {
	public Monster() {
		x = y = 7;
	}
	void move(char c) {
	x+=(Math.random()-0.5)>0? 1: -1;
	y+=(Math.random()-0.5)>0? 1: -1;
	}
}
public class TextGame {

	public static void main(String[] args) {
		char[][] map = {
				{ '#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#' },
				{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
				{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
				{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
				{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
				{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
				{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
				{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
				{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
				{ '#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#' },
				};
		
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		Monster monster = new Monster();
		Gold gold = new Gold();
		
		while (true) {
		for(int y=0; y<map.length; y++) {
			for(int x=0; x<map[y].length; x++) {
				if(y==monster.y&&x==monster.x)
					System.out.print('M');
				else if(y==main.y&&x==main.x)
					System.out.print('@');
				else if(y==gold.y&&x==gold.x)
					System.out.print('G');
				else
					System.out.print(map[y][x]);
				}
			System.out.println();
			}
		System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l): ");
		char c = sc.next().charAt(0);
		main.move(c);
		monster.move(c);
		}

	}
}

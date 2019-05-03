import java.util.Scanner;

class Theater {
	Scanner sc = new Scanner(System.in);
	private int[] A = new int[10];
	private int[] B = new int[10];
	private String Theater_name, Movie_name;
	
	public Theater() {
		
		Theater_name = "CGV";
		Movie_name = "아쿠아맨";
		
		}
	
	public Theater(String Theater_name, String Movie_name) {
		
		this.Theater_name = Theater_name;
		this.Movie_name = Movie_name;
		
	}
	
	public String getTheater() {
		return Theater_name;
	}
	
	public String getMovie() {
		return Movie_name;
	}
	
	void Reserve() {
		System.out.println("좌석 예약 현황입니다. (빈좌석:0, 예약좌석:1)");
		Lookup();
		System.out.println("좌석 예약을 진행합니다.");
		
		while(true) {
			System.out.print("좌석 등급을 선택하세요(A석:1, B석:2): ");
			int seat_grade = sc.nextInt();
			System.out.print("좌석번호를 선택하세요(1~10): ");
			int seat_number = sc.nextInt();
			
			if(seat_number>10 || seat_number<1) {
				System.out.println("올바른 좌석을 선택해주세요.");
			}
			else if(seat_grade<1 || seat_grade>2) {
				System.out.println("올바른 좌석을 선택해주세요.");
			}
			else {
				if(seat_grade == 1) {
					if(A[seat_number-1] == 0) {
						A[seat_number-1] = 1;
						System.out.println("-------------------------");
						System.out.println("    1 2 3 4 5 6 7 8 9 10");
						System.out.println("-------------------------");
						System.out.print("A석: ");
						for(int i=0; i<A.length; i++) {
							System.out.print(A[i] + " ");
						}
						System.out.println("\n-------------------------");
						System.out.println("예약되었습니다.");	
						break;
					}
					else {
						System.out.println("이미 예약된 좌석입니다.");
						break;
					}
				}
				if(seat_grade == 2) {
					if(B[seat_number-1] == 0) {
						B[seat_number-1] = 1;
						System.out.println("-------------------------");
						System.out.println("    1 2 3 4 5 6 7 8 9 10");
						System.out.println("-------------------------");
						System.out.print("B석: ");
						for(int j=0; j<B.length; j++) {
							System.out.print(B[j] + " ");
						}
						System.out.println("\n-------------------------");
						System.out.println("예약되었습니다.");	
						break;
					}
					else {
						System.out.println("이미 예약된 좌석입니다.");
						break;
					}
				}
			}
		}
	}
	
	void Lookup() {
		System.out.println("-------------------------");
		System.out.println("    1 2 3 4 5 6 7 8 9 10");
		System.out.println("-------------------------");
		System.out.print("A석: ");
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println("\n-------------------------");
		System.out.print("B석: ");
		for(int j=0; j<B.length; j++) {
			System.out.print(B[j] + " ");
		}
		System.out.println("\n-------------------------");
	}
	
	void Cancel() {
		System.out.println("좌석 예약 현황입니다.");
		Lookup();
		System.out.println("좌석 취소를 진행합니다.");
		
		while(true) {
			System.out.print("좌석 등급을 선택하세요(A석:1, B석:2): ");
			int seat_grade = sc.nextInt();
			System.out.print("좌석번호를 선택하세요(1~10): ");
			int seat_number = sc.nextInt();
			
			if(seat_number>10 || seat_number<1) {
				System.out.println("올바른 좌석을 선택해주세요.");
			}
			else if(seat_grade<1 || seat_grade>2) {
				System.out.println("올바른 좌석을 선택해주세요.");
			}
			else {
				if(seat_grade == 1) {
					if(A[seat_number-1] == 1) {
						A[seat_number-1] = 0;
						System.out.println("-------------------------");
						System.out.println("    1 2 3 4 5 6 7 8 9 10");
						System.out.println("-------------------------");
						System.out.print("A석: ");
						for(int i=0; i<A.length; i++) {
							System.out.print(A[i] + " ");
						}
						System.out.println("\n-------------------------");
						System.out.println("취소되었습니다.");	
						break;
					}
					else {
						System.out.println("예약되지 않은 좌석입니다.");
						break;
					}
				}
				if(seat_grade == 2) {
					if(B[seat_number-1] == 1) {
						B[seat_number-1] = 0;
						System.out.println("-------------------------");
						System.out.println("    1 2 3 4 5 6 7 8 9 10");
						System.out.println("-------------------------");
						System.out.print("B석: ");
						for(int j=0; j<B.length; j++) {
							System.out.print(B[j] + " ");
						}
						System.out.println("\n-------------------------");
						System.out.println("취소되었습니다..");	
						break;
					}
					else {
						System.out.println("예약되지 않은 좌석입니다.");
						break;
					}
				}
			}
		}
	}
	
	void End() {
		System.out.println("시스템을 종료합니다.");
	}
}

public class TheaterTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("극장 좌석 예약 시스템입니다.");
		Theater obj1 = new Theater();
		Theater obj2 = new Theater("롯데시네마", "겨울왕국");
		
		System.out.println(obj1.getTheater() + "의 " + obj1.getMovie() + " 예매를 시작합니다.");
		while(true) {
			System.out.print("번호를 선택하세요(예약:1, 조회:2, 취소3, 끝내기:4): ");
			int menu = sc.nextInt();
			if(menu == 1)
				obj1.Reserve();
			if(menu == 2)
				obj1.Lookup();
			if(menu == 3)
				obj1.Cancel();
			if(menu == 4) {
				obj1.End();
				break;
				}
			}
		
		System.out.println("\n" + obj2.getTheater() + "의 " + obj2.getMovie() + " 예매를 시작합니다.");
		while(true) {
			System.out.print("번호를 선택하세요(예약:1, 조회:2, 취소3, 끝내기:4): ");
			int menu = sc.nextInt();
			if(menu == 1)
				obj2.Reserve();
			if(menu == 2)
				obj2.Lookup();
			if(menu == 3)
				obj2.Cancel();
			if(menu == 4) {
				obj2.End();
				break;
				}
			}
		
		
	}
}

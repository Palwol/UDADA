import java.util.Scanner;

class Theater {
	Scanner sc = new Scanner(System.in);
	private int[] A = new int[10];
	private int[] B = new int[10];
	private String Theater_name, Movie_name;
	
	public Theater() {
		
		Theater_name = "CGV";
		Movie_name = "����Ƹ�";
		
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
		System.out.println("�¼� ���� ��Ȳ�Դϴ�. (���¼�:0, �����¼�:1)");
		Lookup();
		System.out.println("�¼� ������ �����մϴ�.");
		
		while(true) {
			System.out.print("�¼� ����� �����ϼ���(A��:1, B��:2): ");
			int seat_grade = sc.nextInt();
			System.out.print("�¼���ȣ�� �����ϼ���(1~10): ");
			int seat_number = sc.nextInt();
			
			if(seat_number>10 || seat_number<1) {
				System.out.println("�ùٸ� �¼��� �������ּ���.");
			}
			else if(seat_grade<1 || seat_grade>2) {
				System.out.println("�ùٸ� �¼��� �������ּ���.");
			}
			else {
				if(seat_grade == 1) {
					if(A[seat_number-1] == 0) {
						A[seat_number-1] = 1;
						System.out.println("-------------------------");
						System.out.println("    1 2 3 4 5 6 7 8 9 10");
						System.out.println("-------------------------");
						System.out.print("A��: ");
						for(int i=0; i<A.length; i++) {
							System.out.print(A[i] + " ");
						}
						System.out.println("\n-------------------------");
						System.out.println("����Ǿ����ϴ�.");	
						break;
					}
					else {
						System.out.println("�̹� ����� �¼��Դϴ�.");
						break;
					}
				}
				if(seat_grade == 2) {
					if(B[seat_number-1] == 0) {
						B[seat_number-1] = 1;
						System.out.println("-------------------------");
						System.out.println("    1 2 3 4 5 6 7 8 9 10");
						System.out.println("-------------------------");
						System.out.print("B��: ");
						for(int j=0; j<B.length; j++) {
							System.out.print(B[j] + " ");
						}
						System.out.println("\n-------------------------");
						System.out.println("����Ǿ����ϴ�.");	
						break;
					}
					else {
						System.out.println("�̹� ����� �¼��Դϴ�.");
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
		System.out.print("A��: ");
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println("\n-------------------------");
		System.out.print("B��: ");
		for(int j=0; j<B.length; j++) {
			System.out.print(B[j] + " ");
		}
		System.out.println("\n-------------------------");
	}
	
	void Cancel() {
		System.out.println("�¼� ���� ��Ȳ�Դϴ�.");
		Lookup();
		System.out.println("�¼� ��Ҹ� �����մϴ�.");
		
		while(true) {
			System.out.print("�¼� ����� �����ϼ���(A��:1, B��:2): ");
			int seat_grade = sc.nextInt();
			System.out.print("�¼���ȣ�� �����ϼ���(1~10): ");
			int seat_number = sc.nextInt();
			
			if(seat_number>10 || seat_number<1) {
				System.out.println("�ùٸ� �¼��� �������ּ���.");
			}
			else if(seat_grade<1 || seat_grade>2) {
				System.out.println("�ùٸ� �¼��� �������ּ���.");
			}
			else {
				if(seat_grade == 1) {
					if(A[seat_number-1] == 1) {
						A[seat_number-1] = 0;
						System.out.println("-------------------------");
						System.out.println("    1 2 3 4 5 6 7 8 9 10");
						System.out.println("-------------------------");
						System.out.print("A��: ");
						for(int i=0; i<A.length; i++) {
							System.out.print(A[i] + " ");
						}
						System.out.println("\n-------------------------");
						System.out.println("��ҵǾ����ϴ�.");	
						break;
					}
					else {
						System.out.println("������� ���� �¼��Դϴ�.");
						break;
					}
				}
				if(seat_grade == 2) {
					if(B[seat_number-1] == 1) {
						B[seat_number-1] = 0;
						System.out.println("-------------------------");
						System.out.println("    1 2 3 4 5 6 7 8 9 10");
						System.out.println("-------------------------");
						System.out.print("B��: ");
						for(int j=0; j<B.length; j++) {
							System.out.print(B[j] + " ");
						}
						System.out.println("\n-------------------------");
						System.out.println("��ҵǾ����ϴ�..");	
						break;
					}
					else {
						System.out.println("������� ���� �¼��Դϴ�.");
						break;
					}
				}
			}
		}
	}
	
	void End() {
		System.out.println("�ý����� �����մϴ�.");
	}
}

public class TheaterTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("���� �¼� ���� �ý����Դϴ�.");
		Theater obj1 = new Theater();
		Theater obj2 = new Theater("�Ե��ó׸�", "�ܿ�ձ�");
		
		System.out.println(obj1.getTheater() + "�� " + obj1.getMovie() + " ���Ÿ� �����մϴ�.");
		while(true) {
			System.out.print("��ȣ�� �����ϼ���(����:1, ��ȸ:2, ���3, ������:4): ");
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
		
		System.out.println("\n" + obj2.getTheater() + "�� " + obj2.getMovie() + " ���Ÿ� �����մϴ�.");
		while(true) {
			System.out.print("��ȣ�� �����ϼ���(����:1, ��ȸ:2, ���3, ������:4): ");
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

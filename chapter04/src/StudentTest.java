class Student{
	String name;
	int rollno;
	int age;
	
	public Student() {
		name = "Kim";
		rollno = 20180001;
		age = 20;
	}
}
public class StudentTest {

	public static void main(String[] args) {
		Student obj = new Student();
		
		System.out.println("�л��� �̸�: "+obj.name);
		System.out.println("�л��� �й�: "+obj.rollno);
		System.out.println("�л��� ����: "+obj.age);
	}

}

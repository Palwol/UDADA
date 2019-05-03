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
		
		System.out.println("학생의 이름: "+obj.name);
		System.out.println("학생의 학번: "+obj.rollno);
		System.out.println("학생의 나이: "+obj.age);
	}

}

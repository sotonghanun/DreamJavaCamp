package dreamschool.cscourse.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.studentName = "ȫ�浿";
		stu.studentId = "S001";
		stu.koreanScore = 94;
		stu.englishScore = 80;
		stu.mathScore = 89;
		
		stu.printStudentInfo();
		
		System.out.println("* �й��� �����մϴ�!!!");
		stu.changeStudentId("STU0001");
		
		stu.printStudentInfo();

	}

}

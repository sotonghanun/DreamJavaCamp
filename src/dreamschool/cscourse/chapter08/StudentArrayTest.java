package dreamschool.cscourse.chapter08;

public class StudentArrayTest {

	public static void main(String[] args) {
		Student[] students = { new Student("������", "STU0001", "010-1234-5678"),
				new Student("�̼���", "STU0002", "010-2345-6789"),
				new Student("������", "STU0003", "010-9876-5432")
		};
		
		for(int i = 0; i < students.length; i++) {
			students[i].printStudentInfo();
		}

	}

}

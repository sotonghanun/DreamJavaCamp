package dreamschool.cscourse.chapter06;

public class Student {
	String studentName;
	String studentId;
	int koreanScore;
	int englishScore;
	int mathScore;
	
	double calculateAverage() {
		double average = (koreanScore + englishScore + mathScore) / (double)3;
		return average;
	}
	
	void printStudentInfo() {
		System.out.println("�л��� : " + studentName);
		System.out.println("�й� : " + studentId);
		System.out.println("�������� : " + koreanScore);
		System.out.println("�������� : " + englishScore);
		System.out.println("�������� : " + mathScore);
		System.out.println("������� : " + (int)calculateAverage());
	}
	
	void changeStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	int test() {
		return 0;
	}

}

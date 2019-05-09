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
		System.out.println("학생명 : " + studentName);
		System.out.println("학번 : " + studentId);
		System.out.println("국어점수 : " + koreanScore);
		System.out.println("영어점수 : " + englishScore);
		System.out.println("수학점수 : " + mathScore);
		System.out.println("평균점수 : " + (int)calculateAverage());
	}
	
	void changeStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	int test() {
		return 0;
	}

}

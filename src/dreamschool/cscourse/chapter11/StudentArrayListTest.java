package dreamschool.cscourse.chapter11;

import java.util.ArrayList;

public class StudentArrayListTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("이순신", 80, 90, 95));
		list.add(new Student("김유신", 95, 89, 92));
		list.add(new Student("강감찬", 88, 97, 94));	
		
		Student stu1 = list.get(0);
		stu1.setEnglish(90);
		
		list.remove(1);
		
		for(Student stu2 : list) {
			System.out.println(stu2.getName() + "( 국어 : " + stu2.getKorean() + ", 영어 : " +
		stu2.getEnglish() + ", 수학 : " + stu2.getMath() + " )");
		}
		

	}

}

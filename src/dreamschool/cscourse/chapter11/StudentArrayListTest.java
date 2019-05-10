package dreamschool.cscourse.chapter11;

import java.util.ArrayList;

public class StudentArrayListTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("�̼���", 80, 90, 95));
		list.add(new Student("������", 95, 89, 92));
		list.add(new Student("������", 88, 97, 94));	
		
		Student stu1 = list.get(0);
		stu1.setEnglish(90);
		
		list.remove(1);
		
		for(Student stu2 : list) {
			System.out.println(stu2.getName() + "( ���� : " + stu2.getKorean() + ", ���� : " +
		stu2.getEnglish() + ", ���� : " + stu2.getMath() + " )");
		}
		

	}

}

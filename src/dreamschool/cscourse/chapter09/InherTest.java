package dreamschool.cscourse.chapter09;

public class InherTest {

	public static void main(String[] args) {
		Student stu = new Student("ȫ�浿", "123-4567", "��ǻ�Ͱ��а�");
		Teacher tea = new Teacher("ȫ���", "333-4567", "��ǻ�Ͱ��а�");
		Person per = new Person("������", "4567-7890");
		
		System.out.println("===== Person =====");
		per.eat();
		per.sleep();
		
		System.out.println("===== Student =====");
		stu.study();
		stu.eat();
		
		System.out.println("==== Teacher ====");
		tea.teach();
		tea.eat();
		
	}

}

package dreamschool.cscourse.chapter09;

public class Student extends Person {
	private String department;
	
	
	public Student(String name, String phoneNumber, String department) {
		super(name, phoneNumber);
		this.department = department;
	}


	public void study() {
		System.out.println("���θ� �ؿ�.");
	}
	@Override
	public void eat() {
		super.eat();
		System.out.println("������ �Ծ��.");
	}
}

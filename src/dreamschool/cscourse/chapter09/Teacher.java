package dreamschool.cscourse.chapter09;

public class Teacher extends Person {
	private String subject;
	
	public Teacher(String name, String phoneNumber, String subject) {
		super(name, phoneNumber);
		this.subject = subject;
	}
	public void teach() {
		System.out.println("������ �ؿ�.");
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("�ٰ��� �Ծ��.");
	}

}

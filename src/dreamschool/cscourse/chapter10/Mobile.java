package dreamschool.cscourse.chapter10;

public class Mobile {
	private String production;
	private int price;
	
	public Mobile(String production) {
		this.production = production;
	}
	
	public void call(int time) {
		System.out.println(production + " : " + time + "�� ��ȭ�߽��ϴ�.");
	}
	public void charge(int time) {
		System.out.println(this.production + " : " + time + "�� �����߽��ϴ�.");
	}

}

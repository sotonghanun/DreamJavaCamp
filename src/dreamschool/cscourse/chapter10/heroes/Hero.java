package dreamschool.cscourse.chapter10.heroes;

public class Hero implements CanFly, CanSwim, CanFight{

	@Override
	public void fight() {
		System.out.println("�ο��.");
		
	}

	@Override
	public void swim() {
		System.out.println("���ģ��.");
		
	}

	@Override
	public void fly() {
		System.out.println("����.");
		
	}
	
	public void action() {
		
	}
	
}

package dreamschool.cscourse.chapter10.heroes;

public class SpiderMan extends Hero{
	@Override
	public void action() {
		System.out.print(this.toString() + "��");
		fight();
		
	}
	@Override
	public String toString() {
		return "�����̴���";
	}
}

package dreamschool.cscourse.chapter10.heroes;

public class BatMan extends Hero{
	@Override
	public void action() {
		System.out.print(this.toString() + "��");
		swim();
		System.out.print(this.toString() + "��");
		fight();
		
	}
	@Override
	public String toString() {
		return "��Ʈ��";
	}
}

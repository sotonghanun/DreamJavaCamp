package dreamschool.cscourse.chapter10.heroes;

public class BatMan extends Hero{
	@Override
	public void action() {
		System.out.print(this.toString() + "이");
		swim();
		System.out.print(this.toString() + "이");
		fight();
		
	}
	@Override
	public String toString() {
		return "배트맨";
	}
}

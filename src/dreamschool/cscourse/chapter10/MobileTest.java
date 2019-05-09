package dreamschool.cscourse.chapter10;

public class MobileTest {

	public static void main(String[] args) {
		Mobile[] mobiles = new Mobile[2];
		mobiles[0] = new Galaxy("Galaxy");
		mobiles[1] = new Iphone("IPhone");
		
		
		Galaxy gal = (Galaxy)mobiles[0];
		gal.setOsVersion("안드로이드 오레오");
		Iphone ip = (Iphone)mobiles[1];
		ip.setColor("흰색");
		
		System.out.println("Galaxy : " + gal.getOsVersion());
		
		mobiles[0].call(5);
		mobiles[0].charge(30);
		
		System.out.println("IPHone : " + ip.getColor());
		
		mobiles[1].call(10);
		mobiles[1].charge(15);

	}

}

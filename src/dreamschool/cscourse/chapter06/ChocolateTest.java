package dreamschool.cscourse.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choc = new Chocolate();
		choc.name = "아마도라";
		choc.type = "다크";
		choc.price = 2200;
		
		choc.printChocolateInfo();
		
		String chocName = choc.getName();
		int totalPrice = choc.calculateTotalPrice(20);
		
		System.out.println(chocName + " 초콜릿 20개 : " + totalPrice);
		
		choc.changeChocolateInfo("카페 키리쉬", 2500);
		
		choc.printChocolateInfo();
		
		System.out.println(chocName + " 초콜릿 15개(10%할인) : " + choc.calculateTotalPrice(15, 10));
		
		choc.changeChocolateInfo("트리플 블랑", 2300, "화이트");
		
		choc.printChocolateInfo();
	}

}

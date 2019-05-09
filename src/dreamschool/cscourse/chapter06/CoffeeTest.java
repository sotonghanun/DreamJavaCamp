package dreamschool.cscourse.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee ame = new Coffee();
		ame.name = "아메리카노";
		ame.price = 3500;
		ame.printCoffeeInfo();
		
		Coffee latte = new Coffee();
		latte.name = "카페라떼";
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		Coffee maki = new Coffee();
		maki.name = "마끼야또";
		maki.price = 4500;
		maki.printCoffeeInfo();
	}

}

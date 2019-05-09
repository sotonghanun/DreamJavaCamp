package dreamschool.cscourse.chapter09;

public class Product {
	private String name;
	private int price;
	private int discountRate;
	public Product(String name, int price, int discountRate) {
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public int calculateDiscountPrice() {
		int discountPrice = price * discountRate / 100;
		return discountPrice;
	}
	public void printProductInfo() {
		System.out.println("��ǰ�� : " + this.name);
		System.out.println("���� : W" + this.price + " (������ : " + this.discountRate + "%)");
		System.out.println("�ǸŰ� : W" + calculateDiscountPrice());
	}
	
	

}

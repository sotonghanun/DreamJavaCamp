package dreamschool.cscourse.chapter09;

public class ProductTest {

	public static void main(String[] args) {
		Product laundry = new Product("�뵹��", 450000, 8);
		Television cinema = new Television("�ó׸� TV", 3500000, 10, "ȭ�� ũ�� 151cm");
		
		laundry.printProductInfo();
		System.out.println();
		cinema.printProductInfo();
		System.out.println("��� : " + cinema.getDescription());
		
		System.out.println();
		System.out.println("[����] �������� ��� 15%�� �����մϴ�.");
		laundry.setDiscountRate(15);
		cinema.setDiscountRate(15);
		
		System.out.println(laundry.getName() + "�ǸŰ� : " + laundry.calculateDiscountPrice() + "��");
		System.out.println(cinema.getName() + "�ǸŰ� : " + cinema.calculateDiscountPrice() + "��");

	}

}

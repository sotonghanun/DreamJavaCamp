package dreamschool.cscourse.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choc = new Chocolate();
		choc.name = "�Ƹ�����";
		choc.type = "��ũ";
		choc.price = 2200;
		
		choc.printChocolateInfo();
		
		String chocName = choc.getName();
		int totalPrice = choc.calculateTotalPrice(20);
		
		System.out.println(chocName + " ���ݸ� 20�� : " + totalPrice);
		
		choc.changeChocolateInfo("ī�� Ű����", 2500);
		
		choc.printChocolateInfo();
		
		System.out.println(chocName + " ���ݸ� 15��(10%����) : " + choc.calculateTotalPrice(15, 10));
		
		choc.changeChocolateInfo("Ʈ���� ���", 2300, "ȭ��Ʈ");
		
		choc.printChocolateInfo();
	}

}

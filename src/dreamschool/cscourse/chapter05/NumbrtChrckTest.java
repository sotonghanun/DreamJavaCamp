package dreamschool.cscourse.chapter05;

public class NumbrtChrckTest {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		int mult = num1 * num2;
				
		if (mult < 0) {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		} else if (mult < 10) {
			System.out.println("�� �ڸ� ���Դϴ�.");
		} else if (mult < 100) {
			System.out.println("�� �ڸ� ���Դϴ�.");
		} else {
			System.out.println("�� �ڸ� �� �̻��Դϴ�.");
		}

	}

}

package dreamschool.cscourse.chapter05;

public class PrimeNumberTest {

	public static void main(String[] args) {
		int number = 23;
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				System.out.println("�Ҽ��� �ƴմϴ�.");
				break;
			} else {
				System.out.println("�Ҽ��Դϴ�.");
				break;
			}
		}

	}

}

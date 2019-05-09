package dreamschool.cscourse.chapter05;

public class NumbrtChrckTest {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		int mult = num1 * num2;
				
		if (mult < 0) {
			System.out.println("음수는 확인하지 않습니다.");
		} else if (mult < 10) {
			System.out.println("한 자리 수입니다.");
		} else if (mult < 100) {
			System.out.println("두 자리 수입니다.");
		} else {
			System.out.println("세 자리 수 이상입니다.");
		}

	}

}

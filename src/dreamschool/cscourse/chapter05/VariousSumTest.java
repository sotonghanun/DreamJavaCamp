package dreamschool.cscourse.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int sum = 0;
		int evenSum = 0; //¦���� ��
		int oddSum = 0; //Ȧ���� ��
		
		for( int i = 1; i <= 1000; i++) {
			sum += i;
			if (i % 2 == 0) {
				evenSum += i;
			} else if (i % 2 == 1) {
				oddSum += i;
			}
					
		}
		
		System.out.println("1���� 1000������ �� : " + sum);
		System.out.println("1���� 1000���� ¦������ �� : " + evenSum);
		System.out.println("1���� 1000���� Ȧ������ �� : " + oddSum);
		
	}

}

package dreamschool.cscourse.chapter08;

public class OddEvenIndexSumTest {

	public static void main(String[] args) {
		int[] numbers = { 10, 21, 33, 42, 51, 64, 79, 80 };
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if(i % 2 == 0) {
				evenSum += numbers[i];
			} else {
				oddSum += numbers[i];
			}
		}
		System.out.println("Ȧ�� ��° ������ �� : " + oddSum);
		System.out.println("¦�� ��° ������ �� : " + evenSum);

	}

}

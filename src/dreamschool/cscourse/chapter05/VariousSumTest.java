package dreamschool.cscourse.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int sum = 0;
		int evenSum = 0; //짝수의 합
		int oddSum = 0; //홀수의 합
		
		for( int i = 1; i <= 1000; i++) {
			sum += i;
			if (i % 2 == 0) {
				evenSum += i;
			} else if (i % 2 == 1) {
				oddSum += i;
			}
					
		}
		
		System.out.println("1부터 1000까지의 합 : " + sum);
		System.out.println("1부터 1000까지 짝수들의 합 : " + evenSum);
		System.out.println("1부터 1000까지 홀수들의 합 : " + oddSum);
		
	}

}

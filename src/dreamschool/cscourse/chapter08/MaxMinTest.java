package dreamschool.cscourse.chapter08;

public class MaxMinTest {

	public static void main(String[] args) {
		int[] numbers = {12, 53, 24, 10, 22, 38, 64, 39};
		
		int max = numbers[0];
		int min = numbers[0];
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[0] <= numbers[i]) {
				max = numbers[i];
			}
			if(numbers[0] >= numbers[i]) {
				min = numbers[i];
			}
			
		}
		
		System.out.println("�迭 ������ : " + numbers);
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);

	}
	
}

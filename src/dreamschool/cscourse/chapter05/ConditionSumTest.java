package dreamschool.cscourse.chapter05;

public class ConditionSumTest {

	public static void main(String[] args) {
		int conditionSum = 0;
		
		for(int i = 1; i <= 30; i++) {
			if ((i % 2 != 0) && (i % 3 != 0)) {
				conditionSum += i;	
			}
		}
		System.out.println(conditionSum);

	}

}

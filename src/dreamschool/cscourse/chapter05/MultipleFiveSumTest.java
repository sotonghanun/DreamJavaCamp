package dreamschool.cscourse.chapter05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		int fiveSum = 0;
		int count = 1;
		
		while(fiveSum <= 100) {
			int mulFive = count * 5;
			fiveSum += mulFive;
			System.out.println(count + ". ( +" + mulFive + " )" + fiveSum);
			count++;
			
		}

	}

}

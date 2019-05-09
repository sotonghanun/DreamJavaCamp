package dreamschool.cscourse.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		int score1 = 10;
		int score2 = 20;
		int score3 = 40;
		int score4 = 50;
		int score5 = 80;
		
		double result = 0;
		result += score1 * score2 / 2 * 0.6;
		result += (score3 + score4) / 2 * 0.13;
		result += score5 * 0.27;
		
		System.out.println("평가 점수 : " + result);		
				
		if (result > 100 || result < 0) {
			System.out.println("평가 점수가 올바르지 않습니다.");
		} else if (result >= 95) {
			System.out.println("Special Class입니다!!");
		} else if (result >= 90) {
			System.out.println("Gold Class입니다!!");
		} else if (result >= 85) {
			System.out.println("Silver Class입니다!!");
		} else if (result >= 80) {
			System.out.println("Bronze Class입니다!!");
		}  else {
			System.out.println("Member입니다!!");
		}
		

	}

}

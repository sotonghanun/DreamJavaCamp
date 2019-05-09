package dreamschool.cscourse.chapter05;

public class WhileSumTest {

	public static void main(String[] args) {
		int index = 1;
		int sum = 0;
		
		while(sum <= 50) {
			sum += index;
			index++ ;
		}
		
		System.out.println("х╫╪Ж : " + index);
		System.out.println("гу╟Х : " + sum);
	}

}

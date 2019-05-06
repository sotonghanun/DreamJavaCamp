package dreamschool.cscourse.chapter03;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		String mathScore = "96";
		int englishScore = 82;
		
		int intMathScore = Integer.parseInt(mathScore);		
		
		System.out.println("이름 : " + name);
		System.out.println("수학 점수 : " + mathScore);
		System.out.println("영어 점수" + englishScore);
		System.out.println("----------------------------");
		System.out.println(mathScore + englishScore);
		System.out.println(intMathScore + englishScore);
		
	}

}

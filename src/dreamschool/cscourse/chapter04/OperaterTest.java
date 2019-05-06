package dreamschool.cscourse.chapter04;

public class OperaterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 64;
		
		System.out.println("짝수입니까? : " + (64 % 2 == 0));
		System.out.println("3의 배수입니까? : " + (64 % 3 == 0));	
		System.out.println("2의 배수이면서 7의 배수입니까? : " + (64 % 2 == 0 && 64 % 7 == 0));
		System.out.println("2의 배수이거나 7의 배수입니까? : " + (64 % 2 == 0 || 64 % 7 == 0));
		
	}

}

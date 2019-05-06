package dreamschool.cscourse.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 456;
		int hund = 456 / 100;
		int ten = (456 % 100) / 10;
		int one = 456 % 10;
		
		System.out.println("숫자 : " + num);
		System.out.println("백의자리 : " + hund);
		System.out.println("십의자리 : " + ten);
		System.out.println("일의자리 : " + one);
		
	}

}

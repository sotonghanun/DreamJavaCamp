package dreamschool.cscourse.chapter04;

public class OperaterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 64;
		
		System.out.println("¦���Դϱ�? : " + (64 % 2 == 0));
		System.out.println("3�� ����Դϱ�? : " + (64 % 3 == 0));	
		System.out.println("2�� ����̸鼭 7�� ����Դϱ�? : " + (64 % 2 == 0 && 64 % 7 == 0));
		System.out.println("2�� ����̰ų� 7�� ����Դϱ�? : " + (64 % 2 == 0 || 64 % 7 == 0));
		
	}

}

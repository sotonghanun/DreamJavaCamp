package dreamschool.cscourse.chapter09;

public class AccountTest {

	public static void main(String[] args) {
		FundAccount acc1 = new FundAccount("111-2222", "ȫ�浿", 5000000, 4.7);
		FundAccount acc2 = new FundAccount("666-7777", "ȫ���", 1000000, 2.9);
		
		acc1.openAccount();
		System.out.println("������ �߻��߽��ϴ�.");
		
		System.out.println();
		acc2.openAccount();
		System.out.println("������ �߻��߽��ϴ�.");
	}

}

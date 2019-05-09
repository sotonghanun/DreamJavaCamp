package dreamschool.cscourse.chapter10;

public class AccountTest {

	public static void main(String[] args) {
		Account[] acc = new Account[3];
		acc[0] = new Account("1313-445566", "Àü¿ìÄ¡", 100000);
		acc[1] = new FundAccount("111-2222", "È«±æµ¿", 5000000, 5.6);
		acc[1] = new FundAccount("666-7777", "È«±æ¼ø", 1000000, 2.9);
		
		System.out.println(acc[0]);
		
		System.out.println();
		((FundAccount)acc[1]).earnMoney();
		((FundAccount)acc[2]).earnMoney();
		
		System.out.println(acc[1]);
		System.out.println();
		System.out.println(acc[2]);
	}

}

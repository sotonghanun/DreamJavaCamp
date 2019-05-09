package dreamschool.cscourse.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.accountName = "홍길동";
		acc.accountNumber = "123-456789";
		acc.balance = 10000;
		System.out.println("잔액 : " + acc.balance + "원");
		
		System.out.println("20000원을 입금합니다.");
		acc.deposit(20000);
		System.out.println("잔액 : " + acc.balance + "원");
		
		System.out.println("45000원을 출금합니다.");
		acc.withdraw(45000);
		System.out.println("잔액 : " + acc.balance + "원");
		

	}

}

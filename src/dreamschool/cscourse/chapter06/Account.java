package dreamschool.cscourse.chapter06;

public class Account {
	String accountName; //예금주
	String accountNumber; //계좌번호
	int balance; //잔액
	
	void deposit(int money) {
		if (money < 0) {
			System.out.println("[에러] 음수를 입력할 수 없습니다.");
		} else {
			balance += money;
		}
		
	}
	
	int withdraw(int money) {
		if (money < 0) {
			System.out.println("[에러] 음수를 입력할 수 없습니다.");
			return 0;
		} else if (money > balance) {
			System.out.println("[에러] 잔액이 부족합니다.");
			return 0;
		} else {
			balance -= money;
			return money;
		}
				
	}
	
	void printAccountInfo() {
		System.out.println("계좌 " + accountNumber + " ( 예금주 : " + accountName + " )");
		System.out.println("잔액 : " + balance + "원");
	}

}

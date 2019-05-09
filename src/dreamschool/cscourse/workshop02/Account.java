package dreamschool.cscourse.workshop02;

public class Account {
    
    private String account;
    private int    balance;
    private double interestRate;
    
    public Account() {
        
    }
    
    public Account( String account, int balance, double interestRate ) {
        this.account = account;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    
    /**
     * 이자를 계산하여 반환한다.
     * 
     * @return
     */
    public int calculateInterest() {
        int interest = (int)(balance / 100 * interestRate);
        this.balance += interest;
        return interest;
    }
    
    /**
     * 입금을 통해 잔액을 증가시킨다.
     * 
     * @param money
     */
    public void deposit( int money ) {
        this.balance += money;
        
    }
    
    /**
     * 출금을 통해 잔액을 감소시킨다.
     * 
     * @param money
     */
    public void withdraw( int money ) {
    	if(this.balance < money) {
    		System.out.println("[에러] 잔액이 부족합니다.");
    	} else {
    		this.balance -= money;
    	}
       
    }
    
    /**
     * 계좌 정보를 출력한다.
     */
    public void printAccountInfo() {
        System.out.print( "계좌 정보 : " + account );
        System.out.print( ", 잔액 : " + balance );
        System.out.println( "원, 이자율 : " + interestRate + "%" );
    }
}
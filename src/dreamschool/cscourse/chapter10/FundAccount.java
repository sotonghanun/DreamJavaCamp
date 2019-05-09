package dreamschool.cscourse.chapter10;

public class FundAccount extends Account {
	private double earningRate;
	private int principal;
	
	public FundAccount(String number, String name, int balance, double earningRate) {
		super(number, name, balance);
		this.earningRate = earningRate;
		this.principal = balance;
	}

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	
	public void earnMoney() {
		this.setBalance((int)(this.getBalance() * this.earningRate)); 
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "���¹�ȣ : " + this.getNumber() + "\n";
		str += "������ : " + this.getName() + "\n";
		str += "�ܾ� :" + this.getBalance() + "\n";
		str += "���ͷ� : " + this.earningRate + "( " + this.principal + "��)";
		
		return str;
	}

}

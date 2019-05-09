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
		str += "°èÁÂ¹øÈ£ : " + this.getNumber() + "\n";
		str += "¿¹±İÁÖ : " + this.getName() + "\n";
		str += "ÀÜ¾× :" + this.getBalance() + "\n";
		str += "¼öÀÍ·ü : " + this.earningRate + "( " + this.principal + "¿ø)";
		
		return str;
	}

}

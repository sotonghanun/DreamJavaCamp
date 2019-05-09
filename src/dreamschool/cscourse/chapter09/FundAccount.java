package dreamschool.cscourse.chapter09;

public class FundAccount extends Account {
	private double earningRate;
	
	public FundAccount(String number, String name, int balance, double earningRate) {
		super(number, name, balance);
		this.earningRate = earningRate;
	}

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	
	public void earnMoney() {
		System.out.println("���ͷ� : " + this.earningRate + "%");
		System.out.println("������ �߻��Ͽ����ϴ�.");
	}
	
	@Override
	public void openAccount() {
		System.out.println("���¸� �����մϴ�.");
		System.out.println("���� ��ȣ : " + this.getNumber());
		System.out.println("������ : " + this.getName());
		System.out.println("�ܾ� : " + this.getBalance() + "��");
		System.out.println("���ͷ� : " + this.earningRate + "%");
	}

}

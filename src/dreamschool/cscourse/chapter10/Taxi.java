package dreamschool.cscourse.chapter10;

public class Taxi extends Car{
	private int maxNum;

	public int getMaxNum() {
		return maxNum;
	}
	
	@Override
	public void go(int d) {
		System.out.println("�ýø� Ÿ�� " + d + "km �̵��մϴ�.");
	}

	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	

}

package dreamschool.cscourse.chapter10;

public class Truck extends Car{
	private int maxWeight;

	public int getMaxWeight() {
		return maxWeight;
	}
	
	@Override
	public void go(int d) {
		System.out.println("Ʈ���� Ÿ�� " + d + "km �̵��մϴ�.");
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	


}

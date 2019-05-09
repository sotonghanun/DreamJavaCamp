package dreamschool.cscourse.chapter10;

public class Truck extends Car{
	private int maxWeight;

	public int getMaxWeight() {
		return maxWeight;
	}
	
	@Override
	public void go(int d) {
		System.out.println("트럭을 타고 " + d + "km 이동합니다.");
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	


}

package dreamschool.cscourse.chapter10;

public class Iphone extends Mobile {
	private String color;

	public Iphone(String production) {
		super(production);
		
	}
	
	@Override
	public void charge(int t) {
		System.out.println("IPhone : " + t + "분 충전했더니 Full!!");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

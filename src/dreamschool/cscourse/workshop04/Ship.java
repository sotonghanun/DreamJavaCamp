package dreamschool.cscourse.workshop04;

public class Ship extends Vehicle {
	private int replacement;
	
	public Ship(String modelName, int maxSpeed, int numberLimit, int replacement, boolean available) {
		super(modelName, maxSpeed, numberLimit);
		this.replacement = replacement;
	}

	public int getReplacement() {
		return replacement;
	}

	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}

	public void shipInfo() {
		System.out.println(" ¹è ¼ö ·® : " + replacement + "Åæ");
	}
}

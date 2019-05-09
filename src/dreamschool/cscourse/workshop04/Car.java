package dreamschool.cscourse.workshop04;

public class Car extends Vehicle {
	
	private int mileage;
	
	public Car(String modelName, int maxSpeed, int numberLimit, int mileage) {
		super(modelName, maxSpeed, numberLimit);
		this.mileage = mileage;
	}



	public int getMileage() {
		return mileage;
	}



	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void carInfo() {
		System.out.println(" ��տ��� : " + mileage + "km/l");
	}
}

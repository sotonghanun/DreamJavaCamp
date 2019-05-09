package dreamschool.cscourse.chapter06;

public class Car {
	String carName;
	int carOilAmount;
	double carDistance;
	
	void addOil(int amount) {
		carOilAmount += amount;
		System.out.println("휘발유 " + amount + "L 주유합니다.");
	}
	
	void printCarInfo() {
		System.out.println("[" + carName + "] 남은 기름양 : " + carOilAmount +
				"L, 총 주행거리 : " + carDistance + "km");
	}
	
	void driveCar(String startPoint, String endPoint, double driveDistance) {
		System.out.println(startPoint + "에서 " + endPoint + "까지 " 
					+ driveDistance + "km 주행하였습니다.");
		carDistance += driveDistance;
		carOilAmount -= (int)driveDistance / 20;
	}
	
	void canDriveDistance() {
		double canDrive = carOilAmount * 20;
		System.out.println("주행 가능한 거리는 약 " + canDrive + "km입니다.");
	}
}

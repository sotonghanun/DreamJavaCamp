package dreamschool.cscourse.chapter06;

public class Car {
	String carName;
	int carOilAmount;
	double carDistance;
	
	void addOil(int amount) {
		carOilAmount += amount;
		System.out.println("�ֹ��� " + amount + "L �����մϴ�.");
	}
	
	void printCarInfo() {
		System.out.println("[" + carName + "] ���� �⸧�� : " + carOilAmount +
				"L, �� ����Ÿ� : " + carDistance + "km");
	}
	
	void driveCar(String startPoint, String endPoint, double driveDistance) {
		System.out.println(startPoint + "���� " + endPoint + "���� " 
					+ driveDistance + "km �����Ͽ����ϴ�.");
		carDistance += driveDistance;
		carOilAmount -= (int)driveDistance / 20;
	}
	
	void canDriveDistance() {
		double canDrive = carOilAmount * 20;
		System.out.println("���� ������ �Ÿ��� �� " + canDrive + "km�Դϴ�.");
	}
}

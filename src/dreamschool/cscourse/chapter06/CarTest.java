package dreamschool.cscourse.chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.carName = "DSī~" ;
		car.carOilAmount = 5;
		car.carDistance = 140.0;
		
		car.printCarInfo();
		
		car.addOil(10);
		
		car.printCarInfo();
		
		car.driveCar("IT����", "��õ����", 10.17);
		
		car.printCarInfo();	
		
		car.driveCar("��õ����", "�����ϸ���Ʈ", 60.21);
		
		car.printCarInfo();
		
		car.canDriveDistance();

	}

}

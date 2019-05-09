package dreamschool.cscourse.chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.carName = "DS카~" ;
		car.carOilAmount = 5;
		car.carDistance = 140.0;
		
		car.printCarInfo();
		
		car.addOil(10);
		
		car.printCarInfo();
		
		car.driveCar("IT센터", "인천공항", 10.17);
		
		car.printCarInfo();	
		
		car.driveCar("인천공항", "곤지암리조트", 60.21);
		
		car.printCarInfo();
		
		car.canDriveDistance();

	}

}

package dreamschool.cscourse.chapter10;

public class CarTest {

	public static void main(String[] args) {
		Car[] cars = new Car[2];
		cars[0] = new Taxi();
		cars[1] = new Truck();
		
		cars[0].setOilSize(10);
		cars[1].setOilSize(10);
		Taxi taxi = (Taxi)cars[0];
		taxi.setMaxNum(4);	
		Truck truck = (Truck)cars[1];
		truck.setMaxWeight(100);
		
		cars[0].go(20);
		System.out.println("���� : " + cars[0].getOilSize());
		System.out.println("�ý� ���� : " + taxi.getMaxNum() + "��");
		
		cars[1].go(30);
		System.out.println("���� : " + cars[1].getOilSize());
		System.out.println("Ʈ�� �ִ� ���緮 : " + truck.getMaxWeight() + "kg");
		
		}

	}



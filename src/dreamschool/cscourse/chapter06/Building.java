package dreamschool.cscourse.chapter06;

public class Building {
	public String name;
	String address;
	int totalFloor;
	
	void moveElevator() {
		System.out.println("엘리베이터를 운행합니다.");
	}
	
	void changeAddress(String newAddress) {
		address = newAddress;
	}

}

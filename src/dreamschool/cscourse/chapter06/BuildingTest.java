package dreamschool.cscourse.chapter06;

public class BuildingTest {

	public static void main(String[] args) {
		Building build = new Building();
		build.name = "꿈의학교";
		build.address = "서산시 대산읍 영전1길";
		build.totalFloor = 3;
		
		System.out.println("건물명 : " + build.name);
		System.out.println("주소 : " + build.address);
		System.out.println("전체 층 수 : " + build.totalFloor);
		
		build.moveElevator();
		build.changeAddress("서울시 구로구 고척동");
		
		System.out.println("새 주소 : " + build.address);

	}

}

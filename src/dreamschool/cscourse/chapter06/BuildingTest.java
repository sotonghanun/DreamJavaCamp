package dreamschool.cscourse.chapter06;

public class BuildingTest {

	public static void main(String[] args) {
		Building build = new Building();
		build.name = "�����б�";
		build.address = "����� ����� ����1��";
		build.totalFloor = 3;
		
		System.out.println("�ǹ��� : " + build.name);
		System.out.println("�ּ� : " + build.address);
		System.out.println("��ü �� �� : " + build.totalFloor);
		
		build.moveElevator();
		build.changeAddress("����� ���α� ��ô��");
		
		System.out.println("�� �ּ� : " + build.address);

	}

}

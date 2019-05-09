package dreamschool.cscourse.chapter10;

public class Galaxy extends Mobile implements GooPlay {
	private String osVersion;

	public Galaxy(String production) {
		super(production);
		
	}
	
	@Override
	public void charge(int t) {
		System.out.println("Galaxy : �������͸� " + t + "�� ����");
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	@Override
	public void buy(String kind, int price) {
		System.out.println("Galaxy : " + kind + "���� " + price + "���� �����߽��ϴ�.");
		
	}
	

}

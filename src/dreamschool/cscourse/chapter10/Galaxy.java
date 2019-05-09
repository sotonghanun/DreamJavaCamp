package dreamschool.cscourse.chapter10;

public class Galaxy extends Mobile implements GooPlay {
	private String osVersion;

	public Galaxy(String production) {
		super(production);
		
	}
	
	@Override
	public void charge(int t) {
		System.out.println("Galaxy : 보조배터리 " + t + "분 충전");
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	@Override
	public void buy(String kind, int price) {
		System.out.println("Galaxy : " + kind + "앱을 " + price + "원에 구입했습니다.");
		
	}
	

}

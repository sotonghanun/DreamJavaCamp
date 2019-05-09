package dreamschool.cscourse.chapter07;

public class Computer {
	String model;
	String osVer;
	int production;
	int sales;
	public Computer(String model, String osVer, int production) {
		this.model = model;
		this.osVer = osVer;
		this.production = production;
	}
	public Computer(String model, String osVer, int production, int sales) {
		this.model = model;
		this.osVer = osVer;
		this.production = production;
		this.sales = sales;
	}
	
	void printComputerInfo () {
		System.out.println("===" + this.model + "(" + osVer + ") ===");
		System.out.println("생산 : " + this.production + " / 판매 : " + this.sales);
	}
}
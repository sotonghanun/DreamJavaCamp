package dreamschool.cscourse.chapter07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tv1 = new Television("INFINIA", 1500000);
		Television tv2 = new Television("XCANVAS", 1000000, "LCD TV");
		Television tv3 = new Television("CINEMA", 2000000, "3D TV");
		
		tv1.printTelevisionInfo();
		tv2.printTelevisionInfo();
		tv3.printTelevisionInfo();
		
		int totalPrice = tv1.price + tv2.price + tv3.price;
		
		System.out.println("가격의 합 : " + totalPrice);

	}

}

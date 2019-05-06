package dreamschool.cscourse.chapter03;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "¼¼Á¾´ë¿Õ";
		String manwon = "10000";
		int year = 2017;
		int intManwon = Integer.parseInt(manwon);
		String yesno = "true";
		boolean boolYesno = Boolean.parseBoolean(yesno);
		
		System.out.println(name + " : " + manwon);
		System.out.println(year + "³â");
		System.out.println(manwon + year);
		System.out.println(intManwon + year);
		System.out.println(!boolYesno);
		
	}

}

package dreamschool.cscourse.chapter03;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "�������";
		String manwon = "10000";
		int year = 2017;
		int intManwon = Integer.parseInt(manwon);
		String yesno = "true";
		boolean boolYesno = Boolean.parseBoolean(yesno);
		
		System.out.println(name + " : " + manwon);
		System.out.println(year + "��");
		System.out.println(manwon + year);
		System.out.println(intManwon + year);
		System.out.println(!boolYesno);
		
	}

}

package icehs.science.chapter03;

public class EmployeeInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "ȫ�浿" ;
		String enterYear = "2002" ;
		int nowYear = 2019 ;
		
		int intEnterYear = Integer.parseInt(enterYear) ;
		
		int workingYear = nowYear - intEnterYear ;
		
		System.out.println("�̸� : " + name);
		System.out.println("�Ի�⵵ : " + enterYear);
		System.out.println("�ٹ���� : " + workingYear) ;
		
		System.out.println("�ٹ���� : " + (nowYear - intEnterYear)) ;
		
	}

}

package dreamschool.cscourse.chapter07;

public class PublicationTest {

	public static void main(String[] args) {
		Publication book1 = new Publication();
		Publication book2 = new Publication();
		
		System.out.println(book1);
		System.out.println(book2);
		
		System.out.println("===== ���ǹ� ������ �����մϴ�. =====");
		book1.setTitle("��ȭ�ﱹ��");
		book1.setPrice(-100);
		book1.setPrice(5000);
		book1.setPage(-200);
		book1.setPage(300);
		
		System.out.println("���ǹ� ���� : " + book1.getTitle() + "( " + book1.getPrice() + " ��, " + book1.getPage() + " page )" );

	}

}

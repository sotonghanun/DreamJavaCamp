package dreamschool.cscourse.chapter07;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book("�ظ�����", "�����Ѹ�");
		Book book2 = new Book("�Ű��");
		Book book3 = new Book("�ٶ��� ��", "�Ѻ��", 39200);
		book1.printBookInfo();
		book2.printBookInfo();
		book3.printBookInfo();
	}

}

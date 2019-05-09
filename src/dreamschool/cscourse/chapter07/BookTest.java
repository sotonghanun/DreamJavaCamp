package dreamschool.cscourse.chapter07;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book("해리포터", "조엔롤링");
		Book book2 = new Book("신경숙");
		Book book3 = new Book("바람의 딸", "한비야", 39200);
		book1.printBookInfo();
		book2.printBookInfo();
		book3.printBookInfo();
	}

}

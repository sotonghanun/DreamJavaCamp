package dreamschool.cscourse.chapter11;

import java.util.ArrayList;

public class BookArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book("Java의 정석", 346, 15000));
		list.add(new Book("Oracle 11g", 560, 18000));
		list.add(new Book("JSP 따라하기", 271, 12000));
		
		for(int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			
			System.out.println((i + 1) + ". " + book.getName() + "( " + 
					book.getPage() + " page) : " + book.getPrice() + "원");
			
			System.out.println((i + 1) + ". " + list.get(i).getName() + "( " + 
					list.get(i).getPage() + " page) : " + list.get(i).getPrice() + "원");
		}

	}

}

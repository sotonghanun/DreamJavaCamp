package dreamschool.cscourse.chapter11;

public class Book {
	private String name;
	private int page;
	private int price;
	public Book(String name, int page, int price) {
		this.name = name;
		this.page = page;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}

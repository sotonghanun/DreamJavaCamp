package dreamschool.cscourse.chapter09;

public class Cat extends Animal {
	private String name;
	
	public Cat(int age, String kind, String name) {
		super(age, kind);
		this.name = name;
	}
	@Override
	public String toString() {
		return this.name + "객체가 호출되었네요 ㅋㅋㅋ";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void hunt() {
		System.out.println("쥐를 잡을꺼야!!");
	}
	public void play() {
		System.out.println("모빌 놀이가 좋아요~");
	}
	public void printCatInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.getAge());
		System.out.println("종류 : " + this.getKind());
	}

}

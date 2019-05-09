package dreamschool.cscourse.chapter07;

public class ComputerTest {

	public static void main(String[] args) {
		Computer comp1 = new Computer("R500", "Win 7", 100);
		Computer comp2 = new Computer("R570", "Win 10", 200, 30);
		comp1.printComputerInfo();
		comp2.printComputerInfo();

	}

}

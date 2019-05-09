package dreamschool.cscourse.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat(3, "其福矫救", "具克捞");
		
		cat.printCatInfo();
		
		cat.run();
		cat.hunt();
		cat.play();
		
		System.out.println();
		
		Dog dog = new Dog(2, "大大捞", "矫海府救倾胶虐");
		
		dog.printDogInfo();
		
		dog.run();
		dog.hunt();


	}

}

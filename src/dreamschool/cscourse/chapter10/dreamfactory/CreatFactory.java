package dreamschool.cscourse.chapter10.dreamfactory;

public class CreatFactory {
	public static IProduct create(String name) {
		if(name.contentEquals("A")) {
			return new ProductA();
		} else if(name.contentEquals("B")) {
			return new ProductB();
		} else if(name.contentEquals("C")) {
			return new ProductC();
		} else {
			return null;
		}
	}
	

}

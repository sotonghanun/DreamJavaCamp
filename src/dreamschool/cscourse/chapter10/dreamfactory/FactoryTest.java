package dreamschool.cscourse.chapter10.dreamfactory;

public class FactoryTest {

	public static void main(String[] args) {
		IProduct[] pros = new IProduct[4];
		pros[0] = CreatFactory.create("A");
		pros[1] = CreatFactory.create("B");
		pros[2] = CreatFactory.create("C");
		pros[3] = CreatFactory.create("A");
		
		for(IProduct pro : pros) {
			
		}

	}

}

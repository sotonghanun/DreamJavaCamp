package dreamschool.cscourse.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lottoProbability = 0.0000001235;
		long population = 6973738433L;
		int intLottoProbability = (int)lottoProbability;
		System.out.println("로또 당첨 확률 : " + lottoProbability);
		System.out.println("로또 당첨 확률 int캐스팅 : " + intLottoProbability);
		
		int intPopulation = (int)population;
		System.out.println("전 세계의 인구 수 : " + population);
		System.out.println("전 세계의 인구 수 int캐스팅 : " + intPopulation);
	
	}

}

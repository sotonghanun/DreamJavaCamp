package dreamschool.cscourse.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lottoProbability = 0.0000001235;
		long population = 6973738433L;
		int intLottoProbability = (int)lottoProbability;
		System.out.println("�ζ� ��÷ Ȯ�� : " + lottoProbability);
		System.out.println("�ζ� ��÷ Ȯ�� intĳ���� : " + intLottoProbability);
		
		int intPopulation = (int)population;
		System.out.println("�� ������ �α� �� : " + population);
		System.out.println("�� ������ �α� �� intĳ���� : " + intPopulation);
	
	}

}

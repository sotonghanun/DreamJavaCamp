package dreamschool.cscourse.chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int [] scores = new int[3];
		String [] subjects = new String [3];
		
		scores[0] = 93;
		scores[1] = 87;
		scores[2] = 90;
		
		subjects[0] = "����";
		subjects[1] = "����";
		subjects[2] = "����";
		
		double avg = 0;
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.println(subjects[i] + " : " + scores[i]);
		}
		
		avg = (double)sum / scores.length;
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);

	}

}

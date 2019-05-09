package dreamschool.cscourse.workshop02;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {
		//������ �ڸ��� ��� �ٸ� ���ڰ� ���ö����� ��� ������.
		int compNo = getHiddenNumber();
		
		while(checkNumber(compNo)) {
			compNo = getHiddenNumber();
		}
		System.out.println(compNo);
		
		int count = 1;//������� �������.
		
		//����ڰ� �Է��� ������ �ڸ��� ��� �ٸ� ���ڰ� ���ö�����
		System.out.print("�� �ڸ����� �ٸ� ���ڸ� ���ڸ� �Է��ϼ��� : ");
		int myNo = getUserInput();
		
		while(checkNumber(myNo)) {
			System.out.print("�ùٸ��� ���� �����Դϴ�. �ٽ� �Է��ϼ��� : ");
			myNo = getUserInput();
		}
		
		//System.out.println(myNo);
		
		int compHund = compNo / 100;
		int compTen = compNo % 100 / 10;
		int compOne = compNo % 10;
		int userHund = myNo / 100;
		int userTen = myNo % 100 / 10;
		int userOne = myNo % 10;
		
		int strike = 0;
		int ball = 0;
		
		while (compNo != myNo) {
			strike = 0;
			ball = 0;
			if (compHund == userHund) {
				strike++ ;
			} if (compTen == userTen) {
				strike++ ;
			} if (compOne == userOne) {
				strike++ ;
			} if (compHund == userTen || compHund == userOne) {
				ball++ ;
			} if (compTen == userHund || compTen == userOne) {
				ball++ ;
			} if (compOne == userHund || compOne == userTen) {
				ball++ ;
			}
			
			System.out.print(strike + "S " + ball + "B" + " �ٽ� �Է��ϼ��� ���� : ");
			myNo = getUserInput();
			count += 1;

			
			while(checkNumber(myNo)) {
				System.out.print("�ùٸ��� ���� �����Դϴ�. �ٽ� �Է��ϼ��� : ");
				myNo = getUserInput();
				}
			
			
			
			
			}
			
			System.out.println("OUT!! �����մϴ�.~~~ " + count + "������ ���߼̱���.");
		}
		
		
		
			
		
		//compNo�� myNo�� ��
		//������� --> 1S 2B
		//�¾����� --> �����մϴ�.~~~ x������ ���߼̱���.

	
	// =================================================
	
	public static boolean checkNumber(int number) {
		boolean check = false;
		int hund = number / 100;
		int ten = number % 100 / 10;
		int one = number % 10;
		
		if (hund != 0 && hund != ten && ten != one && hund != one) {
			return check;
		} else {
			return !check;
		}
		//���ڸ� ��� �ٸ������ΰ� üũ�ϴ� ����

	}
	
	
	
	
	public static int getHiddenNumber() {
		Random random = new Random();
		int num = random.nextInt(988);
		return num;
	}
	public static int getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    }

}

package dreamschool.cscourse.workshop02;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {
		//숫자의 자리가 모두 다른 숫자가 나올때까지 계속 돌린다.
		int compNo = getHiddenNumber();
		
		while(checkNumber(compNo)) {
			compNo = getHiddenNumber();
		}
		System.out.println(compNo);
		
		int count = 1;//몇번만에 맞췄는지.
		
		//사용자가 입력한 숫자의 자리가 모두 다른 숫자가 나올때까지
		System.out.print("각 자리수가 다른 세자리 숫자를 입력하세요 : ");
		int myNo = getUserInput();
		
		while(checkNumber(myNo)) {
			System.out.print("올바르지 않은 숫자입니다. 다시 입력하세요 : ");
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
			
			System.out.print(strike + "S " + ball + "B" + " 다시 입력하세요 ㅎㅎ : ");
			myNo = getUserInput();
			count += 1;

			
			while(checkNumber(myNo)) {
				System.out.print("올바르지 않은 숫자입니다. 다시 입력하세요 : ");
				myNo = getUserInput();
				}
			
			
			
			
			}
			
			System.out.println("OUT!! 축하합니다.~~~ " + count + "번만에 맞추셨군요.");
		}
		
		
		
			
		
		//compNo과 myNo를 비교
		//출력형식 --> 1S 2B
		//맞았으면 --> 축하합니다.~~~ x번만에 맞추셨군요.

	
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
		//세자리 모두 다른숫자인가 체크하는 로직

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

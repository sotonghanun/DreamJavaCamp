package dreamschool.cscourse.workshop01;

import java.util.Random;
import java.util.Scanner;

public class Workshop07 {

	public static void main(String[] args) {
		int compNo = getHiddenNumber();
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "번째 기회입니다. 숫자를 입력하세요 : ");
			int userNum = getUserInput();
			if(userNum == compNo) {
				System.out.println("축하합니다!!");
				break;
			} else if(userNum < compNo) {
				System.out.println(userNum + "보다 큽니다.");
			} else if(userNum > compNo) {
				System.out.println(userNum + "보다 작습니다.");
			} 
		} 
		System.out.println("종료합니다. Bye~ Bye~");

	}
	public static int getHiddenNumber() {
		Random random = new Random();
		int num = random.nextInt(100);
		return num;
	}
	public static int getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    }

}

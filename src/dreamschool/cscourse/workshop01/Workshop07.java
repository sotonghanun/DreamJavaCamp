package dreamschool.cscourse.workshop01;

import java.util.Random;
import java.util.Scanner;

public class Workshop07 {

	public static void main(String[] args) {
		int compNo = getHiddenNumber();
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "��° ��ȸ�Դϴ�. ���ڸ� �Է��ϼ��� : ");
			int userNum = getUserInput();
			if(userNum == compNo) {
				System.out.println("�����մϴ�!!");
				break;
			} else if(userNum < compNo) {
				System.out.println(userNum + "���� Ů�ϴ�.");
			} else if(userNum > compNo) {
				System.out.println(userNum + "���� �۽��ϴ�.");
			} 
		} 
		System.out.println("�����մϴ�. Bye~ Bye~");

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

package dreamschool.cscourse.workshop01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// ���� 5.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class Workshop05 {
    
    public static void main( String[] args ) {
        
        System.out.print( "Computer Science ������ �Է��ϼ��� : " );
        double csScore = getUserInput();
        System.out.print( "Java Programming ������ �Է��ϼ��� : " );
        double jpScore = getUserInput();
        System.out.print( "���м��� ������ �Է��ϼ��� : " );
        double emScore = getUserInput();
        System.out.print( "������� ���� ������ �Է��ϼ��� : " );
        double opeScore = getUserInput();
        System.out.print( "������ ������ �Է��ϼ��� : " );
        double bmScore = getUserInput();
        
        double averageScore = (csScore + jpScore + emScore + opeScore + bmScore) / 5;
        
        System.out.println( "==============================" );
        
        System.out.println( "������ " + averageScore + "�� �Դϴ�." );
        
        if (averageScore >= 3.7 && csScore >= 2.5 && jpScore >= 2.5 && emScore >= 2.5 && opeScore >= 2.5 && bmScore >= 2.5) {
        	System.out.println("���� �б� ���б� ����� �Դϴ�.");
        }
    }
    
    public static double getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	double value = scanner.nextDouble();
    	return value;
    }
}

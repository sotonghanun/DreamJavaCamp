package dreamschool.cscourse.workshop01;

import java.util.Scanner;

// ���� 4.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��" );
        int americanoCost = 2000;
        int latteCost = 3000;
        int bagelCost = 1500;
        int cheeseCost = 500;
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int americanoNum = getUserInput();
        System.out.print( " ī��� �ֹ� ���� : " );
        int latteNum = getUserInput();
        System.out.print( " ���̱� �ֹ� ���� : " );
        int bagelNum = getUserInput();
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int cheeseNum = getUserInput();
        
        int americanoSpend = americanoCost * americanoNum;
        int latteSpend = latteCost * latteNum;
        int bagelSpend = bagelCost * bagelNum;
        int cheeseSpend = cheeseCost * cheeseNum;
        
        System.out.println("========= �ݾ� =========");
        System.out.print( " �Ƹ޸�ī�� : " + americanoSpend + "��" + "\n");
        System.out.print( " �� : " + latteSpend + "��" + "\n");
        System.out.print( " ���̱� : " + bagelSpend + "��" + "\n");
        System.out.print( " ũ��ġ�� : " + cheeseSpend + "��" + "\n");
        
        int totalSpend = americanoSpend + latteSpend + bagelSpend + cheeseSpend;
        int point = 0;
        if (totalSpend >= 30000) {
        	point = totalSpend / 100 * 2;
        } else if (totalSpend >= 12000) {
        	point = totalSpend / 100 * 1;
        } else {
        	point = 0;
        }
        
        System.out.println("======================");
        System.out.println("�� ���� �ݾ� : " + totalSpend + "��");
        System.out.println("����Ʈ ���� : " + point + "��");
        
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}

package dreamschool.cscourse.workshop01;

import java.util.Scanner;

// 문제 4.
// 커피 주문을 하려고 한다.
// 메뉴를 보고, 각 메뉴 별로 몇 개씩 주문할 것인지 입력 받아 지불해야 할 총 금액을 계산해 보자.
// 그리고 총 금액이 일정 금액을 넘어서면 포인트를 적립해 준다.
// 총 금액 12000원 이상 : 구매 금액의 1% 적립
// 총 금액 30000원 이상 : 구매 금액의 2% 적립
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= 메뉴 =========" );
        System.out.println( " 1. 아메리카노   2000원" );
        System.out.println( " 2. 카페라떼   3000원" );
        System.out.println( " 3. 베이글   1500원" );
        System.out.println( " 4. 크림치즈   500원" );
        int americanoCost = 2000;
        int latteCost = 3000;
        int bagelCost = 1500;
        int cheeseCost = 500;
        
        System.out.println( "========= 주문 =========" );
        System.out.print( " 아메리카노 주문 수량 : " );
        int americanoNum = getUserInput();
        System.out.print( " 카페라떼 주문 수량 : " );
        int latteNum = getUserInput();
        System.out.print( " 베이글 주문 수량 : " );
        int bagelNum = getUserInput();
        System.out.print( " 크림치즈 주문 수량 : " );
        int cheeseNum = getUserInput();
        
        int americanoSpend = americanoCost * americanoNum;
        int latteSpend = latteCost * latteNum;
        int bagelSpend = bagelCost * bagelNum;
        int cheeseSpend = cheeseCost * cheeseNum;
        
        System.out.println("========= 금액 =========");
        System.out.print( " 아메리카노 : " + americanoSpend + "원" + "\n");
        System.out.print( " 라떼 : " + latteSpend + "원" + "\n");
        System.out.print( " 베이글 : " + bagelSpend + "원" + "\n");
        System.out.print( " 크림치즈 : " + cheeseSpend + "원" + "\n");
        
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
        System.out.println("총 구매 금액 : " + totalSpend + "원");
        System.out.println("포인트 적립 : " + point + "점");
        
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}

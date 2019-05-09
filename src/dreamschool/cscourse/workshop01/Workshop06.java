package dreamschool.cscourse.workshop01;

public class Workshop06 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int dan = 2; dan <= 9; dan++) {
				int result = dan * i;
				if(dan == 9) {
					System.out.print(dan + " * " + i + " = " + result);
				} else {
					System.out.print(dan + " * " + i + " = " + result + "," + "\t");
				}
				
			}
			System.out.println();
		}

	}

}

package dreamschool.cscourse.chapter11;

import java.util.ArrayList;

public class ArrayListAdditionEx {

	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 10;
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(number1);
		list.add(number2);
		list.add(34);
		list.add(130);
		list.add(new Integer(150));
		
		int a = list.get(4);
		System.out.println(a);
		list.remove(1);
		list.set(0,  500);
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(int i : list) {
			System.out.println(i);
		}

	}

}

package week3.day2;

import helper.ArrayHelper;

public class Ex1 {

	public static void main(String[] args) {
		int[] mas = { 1, 2, 3 };
		ArrayHelper.printArrayRec(mas, 0);
		
		int a = test(3);
		int b = test(-7);
		System.out.println("!");
		System.out.println(a);
		System.out.println(b);
	}
	
	public static int test(int val) {
		int result = (val > 0 && val < 5 ) ? val : val * 2;
		return result;
	}

}

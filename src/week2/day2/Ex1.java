package week2.day2;

import helper.ArrayHelper;

public class Ex1 {

	public static void main(String[] args) {
		int[] array1 = ArrayHelper.createArray(10);
		int[] array2 = { 1, 2, 3, 4, 5 };
		ArrayHelper.printArray(array1);
		ArrayHelper.printArray(array2);

		for (int i = array2.length - 1; i >= 0; i--) {
			System.out.print(array2[i] + " ");
		}
	}

}

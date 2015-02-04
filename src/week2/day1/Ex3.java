package week2.day1;

import helper.ArrayHelper;


public class Ex3 {
	public static void main(String[] args) {
		int[] mas = { 1, 2, 3 };
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		int[] mas2 = { 4, 5, 6 };
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + " ");
		}
		System.out.println();
		int[] mas3 = new int[10];
		ArrayHelper.printArray(mas3);
		boolean[] boolMas = {true, false, true};
		System.out.println("\nUsing Arrayhelper");
		int[] arr1 = ArrayHelper.createArray(5);
		ArrayHelper.printArray(arr1);
		
	}

}

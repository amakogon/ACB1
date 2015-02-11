package week3.day1;

import helper.ArrayHelper;

public class SortTest {
	public static void main(String[] args) {
		int[] mas= ArrayHelper.createArray(10);
		System.out.println("Unsorted array");
		ArrayHelper.printArray(mas);
		ArrayHelper.bubbleSort(mas);
		System.out.println("Sorted array");
		ArrayHelper.printArray(mas);
	}
}

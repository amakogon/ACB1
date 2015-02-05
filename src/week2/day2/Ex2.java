package week2.day2;

import helper.ArrayHelper;
import helper.VarHelper;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter value");
		int arraySize = scanner.nextInt();
		int[] array = new int[arraySize]; 
		for(int i = 0; i < arraySize; i=i+2){
			array[i] = VarHelper.generate(10);
		}
		
		ArrayHelper.printArray(array);
	}

}

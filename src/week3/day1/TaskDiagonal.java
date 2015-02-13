package week3.day1;

import helper.MatrixHelper;

public class TaskDiagonal {

	public static void main(String[] args) {
		int[][] mas = new int[3][3];
		for (int i = 0; i < mas.length; i++) {
			for (int j = i; j==i; j++) {
				mas[i][j] = 1;
			}
		}
		MatrixHelper.printMatrix(mas);
	}

}

package week3.day1;

import helper.MatrixHelper;

public class Args {
	public static void main(String[] args) {
		int[][] matrix = new int[3][2];
		MatrixHelper.printMatrix(matrix);
		System.out.println("~~~~~~~~~~~~");
		int[][] table= MatrixHelper.genMatrix(5, 5);
		MatrixHelper.printMatrix(table);
	}
}

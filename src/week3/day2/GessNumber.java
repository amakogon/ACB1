package week3.day2;

import java.util.Scanner;

import helper.VarHelper;

public class GessNumber {

	public static void main(String[] args) {

		int target = VarHelper.generate(5);
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		boolean game = true;
		
		while (game) {
			System.out.println("Enter value");

			input = scanner.nextInt();
			if (target == input) {
				System.out.println("Good job");
				game= false;
			} else {
				System.out.println("try again");
			}
		}

	}

}

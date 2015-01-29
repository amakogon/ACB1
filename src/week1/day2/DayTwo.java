package week1.day2;

import java.util.Scanner;

public class DayTwo {

	public static void main(String[] args) {
		double a = 3.14;
		int b = (int) a;
		System.out.println(b);
		int c = 5, d = 10;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter first value");
		int a1 = sc.nextInt();
		System.out.println("Please, enter second value");
		int b1 = sc.nextInt();

		int c1 = a1 + b1;
		System.out.println("Result = " + c1);

		boolean bool = c1 > 10;
		if (bool) {
			System.out.println("c1 > 10");
		} else if (c1 < 10) {
			System.out.println("c1 < 10");
		} else {
			System.out.println("c1 == 10");
		}
		

	}

}

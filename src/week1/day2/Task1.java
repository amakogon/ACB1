package week1.day2;

import java.util.Scanner;


public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int a = sc.nextInt();
		
		if(a%2 == 0){
			System.out.println("a is even");
		} else if( a > 10) {
			System.out.println("a > 10");
		} else {
			System.out.println("a is bad number");
		}
		
		if ((a > 5 && a < 10)){
			System.out.println("a between 5 and 10 ");
		}
	}

}

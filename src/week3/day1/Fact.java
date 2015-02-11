package week3.day1;

public class Fact {
	public static void main(String[] args) {
		System.out.println("Fact of 5 = " + fact(5));
		System.out.println("Fib = " + fib(100));
	}

	public static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

	public static int fib(int n) {
		if (n <= 2) {
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}
}

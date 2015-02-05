package week2.day2;

public class FindMin {
	public static void main(String[] args) {
		int[] mas = { 10, 5, 3, 15, 8 };
		if (mas.length > 0) {
			int min = mas[0];
			for (int i = 0; i < mas.length; i++) {
				if (mas[i] < min) {
					min = mas[i];
				}
			}
			System.out.println("Min = " + min);
		} else {
			System.out.println("Wrong array");
		}

		if (10 > 5) {
			System.out.println("True");
		}

	}
}

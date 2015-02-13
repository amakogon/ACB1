package week3.day2;

public class BreakTest {
	public static void main(String[] args) {

		label: for (int i = 0; i < 2; i++) {
			System.out.println("asd");
					for (int j = 0; j < 3; j++) {
						break label;
						// System.out.println("123");
					}
			
		}
		System.out.println("after for");
	}

}

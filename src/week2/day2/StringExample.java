package week2.day2;

public class StringExample {
	public static void main(String[] args) {
		System.out.println("jsdfjklsdfjdskl");
		System.out.println(5);
		
		String message = "text";
		char x = message.charAt(2);
		System.out.println(x);
		
		int[] mas = {1,2,1,5};
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if(mas[i] == 1){
				count++;
			}
		}
		
		System.out.println("Count of 1 = " + count);
		
		String s1 = "text";
		String s2 = new String("text");
		
		if (s1.equals(s2)) {
			System.out.println("strings are equal");
		} else {
			System.out.println("not equal");
		}
		
		
		String ex1 = "qwe";
		String ex2 = "qwe";
		
		if(ex1 == ex2) {
			System.out.println("ex1 == ex2");
		}
		
		
		
		
		
		
		
		
		
	}
}

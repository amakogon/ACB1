package week2.day1;

public class Test1 {
	public static void main(String[] args) {
		//initialize array length
		int arraySize = (int) (Math.random() * 4 + 1);
		//initialize array
		int[] mas = new int[arraySize];
		//This is a comment
		
		for(int i = 0;i < mas.length; i=i+1){
			mas[i] = (int) (Math.random() * 20);
			System.out.print(mas[i] + " ");
		}
		int i = 10;
		
		System.out.println();
//		for(int i = 0; i < mas.length; i = i+1){
//			System.out.print(mas[i] + " ");
//		}
		
		
	}
}

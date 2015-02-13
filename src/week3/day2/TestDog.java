package week3.day2;

public class TestDog {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "Jessy";
		dog.age = 4;
		dog.voice();
		dog.name = "Friend";
		dog.voice();
		
		Dog dog2 = new Dog();
		dog2.voice();

	}

}

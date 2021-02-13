package inheritance;

public class Dog extends Omivorus{
	String dogBreedName;
	String dogName;
	String dogColor;
	String dogSound;

	@Override
	public void walk() {
		System.out.println("dog walk");
		
	}

	@Override
	public void sound() {
		System.out.println("dog sound");
		
	}

}

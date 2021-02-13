package inheritance;

public class Donkey extends Hervivorus{
	String donkeybreedName;
	String donkeySound;
	String donkeycolor;
	

	@Override
	public void walk() {
		System.out.println("donkey walk");
		
	}


	@Override
	public void sound() {
		System.out.println("donkey sound");
		
	}
}

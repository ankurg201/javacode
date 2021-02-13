package inheritance;

public class TestCode {

	public static void main(String[] args) {
		
		System.out.println("#################");
		Animal a1 = new Dog();
		
		a1.eat();
		a1.sound();
		a1.walk();
		
		
		System.out.println("#####################");
		a1 = new Lion();
		a1.eat();
		a1.sound();
		a1.walk();

	}

}

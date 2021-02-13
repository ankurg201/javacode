package inheritance;

public interface Animal {
	final int NO_OF_LEG = 4;
	final int NO_OF_EAR = 2;
	final int NO_OF_EYE = 2;
	int NO_OF_NOSE = 1;
	
	abstract void walk();
	void eat();
	void sound();
	
}

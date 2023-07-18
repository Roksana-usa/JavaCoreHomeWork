package hw10Abstraction;

public interface University extends College, Hospital {

	/*
	 * We used only one keyword here . Interface can inherit one or more then one
	 * interface by extends keyword. An Interface can't inherit a regular class or
	 * an abstract class by extends keyword.
	 * 
	 */
	// public University() so interface can not contain default constructor.

	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {

	}

	public static void library() {

	}

}

package hw12Polymorphism;

public class Niece extends Sister {
	/*
	 * When multiple method created by the same name and parameter are same, but the
	 * logic are different is called method Overridden. It also called dynamic
	 * Polymorphism. Method override happen during run time.
	 */

	@Override
	public void sister() {
		// TODO Auto-generated method stub
		super.sister();
	}

	@Override
	public void sister(int age1, int age2, String age4) {
		// TODO Auto-generated method stub
		super.sister(age1, age2, age4);
	}

	@Override
	public int sister(int age1, int age2, int age3, String age4) {
		// TODO Auto-generated method stub
		return super.sister(age1, age2, age3, age4);
	}

}

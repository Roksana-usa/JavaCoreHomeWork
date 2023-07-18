package hw12Polymorphism;

public class Sister {

	/*
	 * When different methods exit with the same method name but with different
	 * parameters or signature, it is called method overloading. Method overloading
	 * occurs during compile time.
	 */

	// void type method implemented.
	public void sister() {
		System.out.println("This is from void type method from Sister Class");
	}

	// void type parameterized method is implemented
	public void sister(int age1, int age2, String age4) {
		int AllSisterAge1 = age1 + age2 + Integer.parseInt(age4);
		System.out.println("Total age of all sisters age1: " + AllSisterAge1);
	}

	// Return type parameterized method implemented
	public int sister(int age1, int age2, int age3, String age4) {
		int AllSisterAge2 = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println("The total age of all sisters age2: " + AllSisterAge2);
		return AllSisterAge2;
	}

	// Static type method implemented
	public static int sister(int age1, int age2, int age3, String age4, int age6) {
		int AllSisterAge3 = age1 + age2 + age3 + Integer.parseInt(age4) + age6;
		System.out.println("The total age of all sisters age3" + AllSisterAge3);
		return AllSisterAge3;

	}

	// Return type parameterized method which is final implemented
	public final int sister(int age1, int age2, int age3, int age5, int age6) {
		int AllSisterAge4 = age1 + age2 + age3 + age5 + age6;
		System.out.println("The total age of all sister age4 " + AllSisterAge4);
		return AllSisterAge4;

	}

}

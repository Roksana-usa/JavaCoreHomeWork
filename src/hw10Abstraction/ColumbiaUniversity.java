package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool {
	// This is a regular class, regular class never except any abstract method.
	// Inside a regular class method should be implemented or non-abstract.
	// public abstract void chemistry();

	// Yes we can create default constructor inside a regular class.
	public ColumbiaUniversity() {

	}

	public void biology() {
		System.out.println("This method is from ColumbiaUniversity class.");

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}
}

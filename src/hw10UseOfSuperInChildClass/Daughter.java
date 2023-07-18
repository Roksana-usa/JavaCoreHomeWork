package hw10UseOfSuperInChildClass;

public class Daughter extends Father {

	public int birthMonth;
	public int age;

	public Daughter() {
		super();
		super.father();
		super.fatherInfo("Md.Abdur Razzak", 65, 'M', true);
		super.familyName = "Razzak";
		System.out.println("This is the default constructor from daughter");
	}

	public Daughter(int birthMonth, int age) {

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("\nMy birthday month is " + birthMonth + "\nMy age is " + age);
	}

	public void daughter() {
	}

	public void daughterInfo(int birthMonth, int age) {
		super.father();
		super.fatherInfo("Roksana Akter", 38, 'F', true);
		super.familyName = "Runu";

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("\nMy birthday month is " + birthMonth + "\nMy age is " + age);
		System.out.println(" My family Family Name is: " + familyName);

	}

}

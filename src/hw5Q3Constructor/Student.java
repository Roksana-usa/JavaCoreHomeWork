package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean sProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is from the default Constructor of the Student class.");

	}

	public Student(String stName, int stID, char sex, boolean sProgrammer, float grade) { // {(hints: source -- generate
																							// constructor using
																							// fields-)
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.sProgrammer = sProgrammer;
		this.grade = grade;
		System.out.println("\nStudent Name:" + stName + "\nID:" + stID + "\nSex:" + sex + "\nJava Programmer?:"
				+ sProgrammer + "\ngGrade:" + grade);
	}

}

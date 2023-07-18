package hw9Abstraction;

public abstract class MedicalSchool {
	// Yes we can create default constructor inside the Abstract class.
	public MedicalSchool() {
		
	}	
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This method is from Abstract class MedicalSchool.");
		
	}	
}

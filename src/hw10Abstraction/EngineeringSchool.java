package hw10Abstraction;

public abstract class EngineeringSchool {
	
  /* Here we can use 2 keywords extends and implements.
     An abstract class can inherit only one abstract class or one regular class by extends keyword.
	 An abstract class can't inherit an Interface by extends keyword.
	 Implements keyword is used to inherit Interface in abstract class.
	 An abstract class can inherit more than one Interface.
	 An abstract class cannot inherit a regular class or abstract class by implements keyword.
*/
	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("This method is from Abstract class EngineeringSchool.");

	}
}

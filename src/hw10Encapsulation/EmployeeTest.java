package hw10Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Roksana Akter");
		emp.setAge(38);
		emp.setSex('F');
		emp.setCitizen(true);
		System.out.println("My name is " + emp.getName() + "\nMy age is " + emp.getAge() + "\nMy sex " + emp.getSex()
				+ "\nAm I USA citizen? Ans: " + emp.isCitizen());
	}
}

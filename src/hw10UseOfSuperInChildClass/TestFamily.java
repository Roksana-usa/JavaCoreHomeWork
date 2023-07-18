package hw10UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("Default Constructor initialized from Father class:");
		Father father = new Father();
		System.out.println("\nParameterized constructor initialized from Father class:");

		Father father01 = new Father("Md. Abdur Razzak", 65, 'M', true);
		System.out.println("\n Void type Paramitarized method initialized from Father class:");
		father.father();

		System.out.println("\nVoid type Parameterized method initialized from Father class:");
		father.fatherInfo("Md.Abdur Razzak", 65, 'M', true);

		System.out.println("\nDefault Constructor initialized from Daughter class:");
		Daughter daughter = new Daughter();

		System.out.println("\nParameterized constructor initialized from Daughter class:");
		Daughter daughter2 = new Daughter(01, 38);

		System.out.println("\nVoid type paraetarized method initialized from Daughter class:");
		daughter.daughter();

		System.out.println("\nparameterized type method initialized from Dughter class:");
		daughter.daughterInfo(01, 38);

	}

}

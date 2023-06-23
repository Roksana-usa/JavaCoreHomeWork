package hw4JavaVariables;

public class AboutMe {

	// Here variable is declared.
	public String myFirstName;
	public String myLastName;
	public boolean usCitizenShipStatus;
	public byte myAge;
	public char myBuildingNumber;
	public int myApartmentNumber;
	public float myGrade;
	public short myHousePrice;
	public long myBankBalance;
	public double myHeight;

	public AboutMe() {// Here constructor declared.
		System.out.println("This is all about us:");
	}

	public void aboutMe() {// method is implemented.
		System.out.println("My name is " + myFirstName + " " + myLastName + ".\nMy height is" + myHeight
				+ ".\nUs citizenship " + usCitizenShipStatus + ".\nI am " + myAge + " .\nyears old " + ".\nI am a "
				+ myBuildingNumber + " .\nMy Salary is " + myApartmentNumber + " .\nMy grade is " + myGrade
				+ " .\nMy car price is " + myHousePrice + ".\nMy bank balance is " + myBankBalance + "");

	}

}

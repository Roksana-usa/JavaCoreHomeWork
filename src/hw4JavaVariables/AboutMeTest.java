package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe Roksana = new AboutMe();// Here constructor initialized.
		Roksana.myFirstName = "Roksana";
		Roksana.myLastName = "Akter";
		Roksana.usCitizenShipStatus = true;
		Roksana.myAge = 60;
		Roksana.myBuildingNumber = 'O';
		Roksana.myApartmentNumber = 40;
		Roksana.myGrade = 3.2f;
		Roksana.myHousePrice = 32000;
		Roksana.myBankBalance = 320000;
		Roksana.myHeight = 3.4;
		Roksana.aboutMe();// Here method initialized.

		System.out.println("\nAlex information is down below");
		System.out.println("\n");

		AboutMe Alex = new AboutMe();
		Alex.myFirstName = "Alex";
		Alex.myLastName = "John";
		Alex.usCitizenShipStatus = false;
		Alex.myAge = 70;
		Alex.myBuildingNumber = 'A';
		Alex.myApartmentNumber = 30;
		Alex.myGrade = 3.3f;
		Alex.myHousePrice = 31000;
		Alex.myBankBalance = 322000;
		Alex.myHeight = 3.6;
		Alex.aboutMe();// Here method initialized.
	}

}
